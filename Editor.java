import java.awt.*;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.write("first");
        textEditor.save();
        textEditor.print();

        textEditor.write("second");
        textEditor.print();
        textEditor.write("third");
        textEditor.print();
        textEditor.save();

        textEditor.undo();
        textEditor.print();
        textEditor.undo();
        textEditor.print();
        textEditor.undo();
        textEditor.print();


    }
}

class TextEditor {
    private String text;
    private Stack<TextEditor.Memento> stack = new Stack<>();

    public void write(String text) {
        this.text = text;
    }

    public void save(){
        Memento state =  new Memento(text);
        stack.push(state);
    }


    public void print(){
        System.out.println(text);
    }

    public void undo(){
        if(stack.isEmpty()){
            return;
        }
        text = stack.pop().getText();
    }



    public static class Memento{
        private final String text;
        private Memento(String text){
            this.text = text;
        }
        private String getText(){
            return text;
        }
    }
}

