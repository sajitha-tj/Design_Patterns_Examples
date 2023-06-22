package Prototype_ShapeCreator;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double x, double y, String colour, double radius){
        super(name, x, y, colour);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }


    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString(){
        return "Circle: " + super.toString() + ", radius: " + radius;
    }
}
