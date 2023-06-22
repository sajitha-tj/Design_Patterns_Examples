package Prototype_ShapeCreator;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double x, double y, String colour, double width, double height){
        super(name, x, y, colour);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(this);
    }

    @Override
    public String toString(){
        return "Rectangle: " + super.toString() + ", width: " + width + ", height: " + height;
    }
}
