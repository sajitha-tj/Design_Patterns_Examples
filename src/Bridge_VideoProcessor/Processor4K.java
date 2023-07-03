package Bridge_VideoProcessor;

public class Processor4K implements VideoProcessor{
    private String type;

    public Processor4K(){
        this.type = "4K processor";
    }
    @Override
    public void process() {
        System.out.println("processed using " + this.type);
    }
}
