package AbstractFactory_FurnitureFactory;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}
