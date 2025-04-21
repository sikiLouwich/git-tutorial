public class Abstruct {
    public static void main(String[] args) {

    }
}
class ZZZ{}

abstract class Animal extends ZZZ {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
    public String getName() {
        return name;
    }
//    private abstract String nasdd(){ ======>> private not go with abstract method
//        return name;
//    }
}


class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void eat() {
        System.out.println("Dog eat");
    }
    void sleep() {
        System.out.println("Dog sleep");
    }
    @Override
    public String getName(){
        return super.name + "!!!";
    }

}