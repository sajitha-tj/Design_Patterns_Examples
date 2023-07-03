package Bridge_VideoProcessor;

public class Main {
    public static void main(String[] args) {
        VideoProcessor p4K = new Processor4K();

        VideoTool yt = new YoutubeTool(p4K);
        NetflixTool netflix = new NetflixTool(new ProcessorHD());

        yt.playVideo();
        netflix.playVideo();
        netflix.addToFav();
    }
}
