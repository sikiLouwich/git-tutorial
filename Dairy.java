import java.util.ArrayList;
import java.util.List;

abstract class Food {
    int cost;
    public Food(int cost) {
        this.cost = cost;
    }
}
class Dairy extends Food {
    String brand;
    Dairy(int cost, String brand) {
        super(cost);
        this.brand = brand;
    }
}
class Milk extends Dairy {
    Milk(int cost, String brand) {
        super(cost, brand);
    }
}
class Cheese extends Dairy {
    Cheese(int cost, String brand) {
        super(cost, brand);
    }
}
class main {
    public static void main(String[] args) {
//        List<? extends Milk> list = new ArrayList<>();
//        list.add(new Dairy(2, "Tnuva"));
//        list.add(new Cheese(4, "Tara"));
//        list.add(new Milk(6, "Strauss"));
    }
}
