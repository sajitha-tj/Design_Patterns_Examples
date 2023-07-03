package Decorator_FileSystemTool;

public class FileDecorator implements File{
    private File file;

    public FileDecorator(File file){
        this.file = file;
    }

    @Override
    public String read() {
        return file.read();
    }
}
