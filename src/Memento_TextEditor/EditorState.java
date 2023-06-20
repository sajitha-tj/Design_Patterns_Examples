package Memento_TextEditor;

public class EditorState implements Memento{
    private final String content;

    public EditorState(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
