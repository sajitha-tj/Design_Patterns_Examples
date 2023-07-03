package Proxy_VideoDownloader;

import java.util.HashMap;

public class CachedVideoDownloader implements IVideoDownloader{
    HashMap<String,Video> cache = new HashMap<>();
    VideoDownloader videoDownloader = new VideoDownloader();
    @Override
    public Video downloadVideo(String videoName) {
        Video vdo;
        if(cache.containsKey(videoName)){
            System.out.println("Retrieving from cache...");
            System.out.println(videoName + " retrieved");
            vdo = cache.get(videoName);
        }else{
            vdo = videoDownloader.downloadVideo(videoName);
            cache.put(videoName,vdo);
        }
        return vdo;
    }
}
