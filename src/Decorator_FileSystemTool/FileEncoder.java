package Decorator_FileSystemTool;

public class FileEncoder extends FileDecorator{

    public FileEncoder(File file){
        super(file);
    }
    @Override
    public String read() {
        return encode();
    }

    public String encode(){
        String str = super.read();
        str = String.valueOf(str.hashCode());
        return str;
    }
}
