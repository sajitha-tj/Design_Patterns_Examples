package Bridge_VideoProcessor;

public class ProcessorHD implements VideoProcessor{
    private String type;

    public ProcessorHD(){
        this.type = "HD processor";
    }
    @Override
    public void process() {
        System.out.println("processed using " + this.type);
    }
}
