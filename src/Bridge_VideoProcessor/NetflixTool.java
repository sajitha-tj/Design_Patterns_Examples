package Bridge_VideoProcessor;

public class NetflixTool extends VideoTool{

    public NetflixTool(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    public void addToFav(){
        System.out.println("added to Favourite!");
    }
}
