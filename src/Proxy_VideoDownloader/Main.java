package Proxy_VideoDownloader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IVideoDownloader videoDownloader = new CachedVideoDownloader();

//        videoDownloader.downloadVideo("Metro Booming - Calling");
//        videoDownloader.downloadVideo("TwentyOne Pilot - Stressed Out");
//        videoDownloader.downloadVideo("Metro Booming - Calling");
//        videoDownloader.downloadVideo("Metro Booming - Calling");
//        videoDownloader.downloadVideo("TwentyOne Pilot - Stressed Out");
//        videoDownloader.downloadVideo("Avicii - Nights");
//        videoDownloader.downloadVideo("Avicii - Nights");


        Scanner scanner = new Scanner(System.in);
        String vdoName;
        while (true){
            vdoName = scanner.next();
            if (vdoName.equals("-1")){
                break;
            }
            videoDownloader.downloadVideo(vdoName);
        }
    }
}
