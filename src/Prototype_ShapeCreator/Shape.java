package Prototype_ShapeCreator;

public abstract class Shape{
    private String name;
    private double x;
    private double y;
    private String colour;

    public abstract Shape clone();

    public Shape(String name, double x, double y, String colour) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public Shape(Shape shape){
        this.name = shape.name;
        this.x = shape.x;
        this.y = shape.y;
        this.colour = shape.colour;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", x: " + x + ", y: " + y + ", colour: " + colour;
    }
}
