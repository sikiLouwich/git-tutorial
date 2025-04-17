import java.util.Arrays;

public enum Days{
    sunday, monday, tuesday, wednesday, thursday, friday, saturday
}

public enum PColors{WHITE, BLACK};

class P{
    private PColors color;

    public P(PColors color){
        this.color = color;
    }
}

interface Color{
    void printColor();
    void printWithWhiteColor();
    void printWithBlackColor();
    void printColor(String color);
}

interface Rainbow extends Color{
    void printRainbow();
}



class Blue implements Color, Rainbow{
    String name;
    public Blue(String name){
        this.name = name;
    }
    public void printColor(){
        System.out.println(name);
    }
    public void printWithWhiteColor(){
        System.out.println(name + " " + PColors.WHITE);
    }
    public void printWithBlackColor(){
        System.out.println(name + " " + PColors.BLACK);
    }
    public void printColor(String color){
        System.out.println(name + " " + color);
    }
    public void printRainbow(){
        System.out.println(name);
    }
}

public class A{
    String name;
    int age;

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    public A(String name){
        this.name = name;
        this.age = 0;
    }
    public A(int age){
        this.age = age;
        this.name = "";
    }
    public A(){
        this.age = 0;
        this.name = "";
    }


}

public void main(String[] args) {
//    Days day = Days.sunday;
//    int[] arr = new int[3];
//    arr[0] = 1;
//
//    System.out.println(Arrays.toString(arr));
//    System.out.println(Days.monday);
//    P p = new P(PColors.BLACK);
    Rainbow rainbow = new Blue("rainbow");
    Blue blue = new Blue("blue");
    Color green = new Blue("green");
    rainbow.printRainbow();
    blue.printColor();
    green.printWithBlackColor();
    int x= 9;
    int y = 8;
    System.out.println(x /y );


//    String ski = "ski is fun";
//    String ski2 = "ski2";
//    System.out.println(ski);
//
//    System.out.println(ski.length());
//    System.out.println(ski.charAt(0));
//    String n_s = ski.replaceFirst("s", "r");
//
//    System.out.println(ski.equals(n_s));
//    System.out.println(n_s);
//    Random rand = new Random();
//    for (int i = 0; i < 5; i++){
//        System.out.println(rand.nextInt(100));
//    }


}