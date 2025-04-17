//the single choice principle
//circle is circle and shape too => polymorphism

public class ShapesFactory {
    public  static Shape factory(String shapeName) {
        Shape shape = null;
        switch (shapeName) {
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Circle":
                shape = new Circle();
                break;
            case "Triangle":
                shape = new Triangle();
                break;
            default:
                break;
        }
        return shape;
    }

    public static void main(String[] args) {
        ShapesFactory shapeFactory = new ShapesFactory();
        Shape shape = shapeFactory.factory("Rectanle");
        System.out.println(shape);
    }
}

interface Shape {
    void draw();

}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Triangle");
    }
}

