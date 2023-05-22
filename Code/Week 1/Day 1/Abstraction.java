public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
    }
}

abstract class Shape{
    abstract void draw();
}


class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    
}