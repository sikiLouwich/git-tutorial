class A__ {
    void display() {
        System.out.print("A");
    }
}
class B extends A__ {
    void display() {
        super.display();
        System.out.print("B");
    }
}
class C extends B {
    private static int counter = 0;
    @Override
    void display() {
        super.display();
        System.out.print("C");
    }
}

class Test {
    public static void main(String[] args) {
        B obj = new C();
        obj.display();
        C obj2 = new C();
    }
}