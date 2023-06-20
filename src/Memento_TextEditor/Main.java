package Memento_TextEditor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        System.out.println(editor.getContent());
        history.push(editor.createState());

        editor.setContent("b");
        System.out.println(editor.getContent());
        history.push(editor.createState());

        editor.setContent("c");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}