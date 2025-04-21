//public class CoffeeDecorator {
//
//}

interface Coffee {
    String getDescription();
    int getPrice();
    default void makeCoffee() {
        System.out.println("Making coffee");
    }
}

abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() * 2;
    }
}

class FlatWhiteCoffee implements Coffee {
    private String description;
    private int price;
    public FlatWhiteCoffee(String description, int price) {
        this.description = description;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public void makeCoffee() {
        System.out.println("Making coffee : " + description);
    }
}

class WhiteCoffee implements Coffee {
    private String description;
    private int price;
    public WhiteCoffee(String description, int price) {
        this.description = description;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
}
