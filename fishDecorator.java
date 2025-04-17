//we can use many Decorators for single class
//we can add decorators during runtime
//easy to recognize - the class implement interface and hold instance ???

interface Fish{
    String eat();
    void sleep();
}

public interface FishDecorator extends Fish {}

class BabyFish implements Fish{
    @Override
    public String eat() {
        return "Baby Fish";
    }
    @Override
    public void sleep() {
        System.out.println("Baby fish sleep");
    }
}

static class GoldFish implements FishDecorator{
    Fish fish;
    public GoldFish(Fish fish) {
        this.fish = fish;
    }

    @Override
    public String eat() {
        return STR."Goldfish \{fish.eat()}";
    }

    @Override
    public void sleep() {
        fish.sleep();
    }
}

class StripedFish implements FishDecorator{
    Fish fish;
    private String name;
    public StripedFish(Fish fish, String name) {
        this.fish = fish;
        this.name = name;
    }

    @Override
    public String eat() {
        return STR."Striped \{fish.eat()}";
    }

    @Override
    public void sleep() {
        fish.sleep();
    }
}

public void main(String[] args) {
    Fish fish = new BabyFish();
    fish = new StripedFish(fish, "Striped");
    fish = new GoldFish(fish);
    System.out.println(fish.eat());
}