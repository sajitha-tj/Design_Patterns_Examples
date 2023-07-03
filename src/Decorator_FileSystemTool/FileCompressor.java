package Decorator_FileSystemTool;

public class FileCompressor extends FileDecorator{
    public FileCompressor(File file) {
        super(file);
    }

    @Override
    public String read(){
        return compress();
    }

    public String compress(){
        String compData = super.read();
        compData = compData.replace(" ", "");
        return compData;
    }
}
