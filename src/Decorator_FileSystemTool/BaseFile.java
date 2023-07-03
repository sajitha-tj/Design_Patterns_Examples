package Decorator_FileSystemTool;

public class BaseFile implements File{
    private String data;

    public BaseFile(String data){
        this.data = data;
    }

    @Override
    public String read() {
        return data;
    }
}
