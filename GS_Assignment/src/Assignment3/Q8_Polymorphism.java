package Assignment3;
class Shape {
    void area() {
        System.out.println("Area : ");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}
public class Q8_Polymorphism {
    public static void main(String[] args) {
        Shape obj = new Rectangle();
        obj.area();
        obj = new Circle();
        obj.area();
    }
}