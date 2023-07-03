package Decorator_FileSystemTool;

public class Main {
    public static void main(String[] args) {
        File a = new BaseFile("Hello World! Here is a Decorator design pattern.");
        System.out.println(a.read());
        File b = new FileCompressor(a);
        System.out.println(b.read());
        File c = new FileEncoder(b);
        System.out.println(c.read());

        File file = new FileEncoder(new FileCompressor(new BaseFile("Hey! here is a single line usage.")));
        System.out.println(file.read());
    }
}
