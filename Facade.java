//abstraction
// encapsulation

public class Facade {
    public static void main(String[] args) {

    }
}

abstract class Item {
}

class Pasta extends Item {}
class Salad extends Item {}
class Wine extends Item {}

class Pantry{

}

class Pot{

}

class Chef{
    private Pasta pasta;
    private Salad salad;
    private Wine wine;
    private Pantry pantry;
    private Pot pot;
    public Chef(){
        pasta = new Pasta();
        salad = new Salad();
        wine = new Wine();
        pantry = new Pantry();
        pot = new Pot();
    }

    public void fullMeal(){
        
    }
}