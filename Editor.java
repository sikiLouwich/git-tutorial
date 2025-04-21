import java.util.Stack;
//caretaker
public class Editor {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.write("siki");
        originator.read();
        originator.write("siki");
        originator.save();
        originator.read();
        originator.write("siki");
        originator.write("siki");
        originator.read();
        originator.restore();
        originator.read();

    }
}

//originator
class Originator{
    String state;
    Memento memento;
    public Originator(){
        this.state = "";
    }

    public void write(String text){
        this.state += text;
    }
    public void read(){
        System.out.println(this.state);
    }

    public void save(){
        memento = new Memento(state);
    }

    public void restore(){
        this.state = memento.getState();
    }


    //memento
    public static class Memento{
        private final String state;
        private Memento(String state){
            this.state = state;
        }

        public String getState(){
            return state;
        }
    }
}

