package AbstractFactory_FurnitureFactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        System.out.println("Modern AbstractFactory_FurnitureFactory.Table created");
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        System.out.println("Modern AbstractFactory_FurnitureFactory.Chair created");
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Modern AbstractFactory_FurnitureFactory.Sofa created");
        return new ModernSofa();
    }
}
