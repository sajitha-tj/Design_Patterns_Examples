package Prototype_ShapeCreator;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Rectangle", 1, 1, "Red", 2, 3);
        System.out.println(r1);

        Rectangle r2 = r1.clone();
        System.out.println(r2);

        Circle c1 = new Circle("Circle", 2, 2, "Blue", 4);
        System.out.println(c1);

        Circle c2 = c1.clone();
        System.out.println(c2);
    }
}
