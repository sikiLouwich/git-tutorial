public class Inheritance {
    public static void main(String[] args) {
        Father son = new Son("a", 1);
        System.out.println(son.getAge());
        System.out.println(son.getName());
    }
}

class Father{
    private String name;
    private int age;
    protected int money = 100;

    public Father(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}


class Son extends Father{

    public Son(String name, int age) {
        super(name, age);
    }

    public int getMoney(){
        return super.money;
    }

    public String getName(){
        return super.getName() + " " + super.getAge();
    }
}