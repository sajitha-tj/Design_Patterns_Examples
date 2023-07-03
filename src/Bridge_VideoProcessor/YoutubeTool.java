package Bridge_VideoProcessor;

public class YoutubeTool extends VideoTool{
    public YoutubeTool(VideoProcessor videoProcessor){
        super(videoProcessor);
    }

    public void likeVideo(){
        System.out.println("likes +1");
    }
}
