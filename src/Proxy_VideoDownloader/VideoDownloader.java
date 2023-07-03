package Proxy_VideoDownloader;

public class VideoDownloader implements IVideoDownloader{
    @Override
    public Video downloadVideo(String videoName) {
        System.out.println("Searching for video...");
        System.out.println("Downloading video: " + videoName);
        System.out.println("Processing...");
        System.out.println("'" + videoName + " ' Saved!");
        return new Video(videoName);
    }
}
