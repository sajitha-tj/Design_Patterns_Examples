package Bridge_VideoProcessor;

public abstract class VideoTool {
    private VideoProcessor videoProcessor;

    public VideoTool(VideoProcessor videoProcessor){
        this.videoProcessor = videoProcessor;
    }
    public void playVideo(){
        videoProcessor.process();
    }
}
