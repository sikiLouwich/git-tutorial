public class Shadowing {
    public static void main(String[] args) {
        AShadow aShadow = new BShadow();
        BShadow bShadow = (BShadow) aShadow;
        System.out.println(bShadow.x);
        bShadow.staticMethod();
    }
}

class AShadow{
    public int x = 1;
    public static void staticMethod(){
        System.out.println("staticMethod 1");
    }
}

class BShadow extends AShadow{
    public int x = 2;
    public static void staticMethod(){
        System.out.println("staticMethod 2");
    }
}
