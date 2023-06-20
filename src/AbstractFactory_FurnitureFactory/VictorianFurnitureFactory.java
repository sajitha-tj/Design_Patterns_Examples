package AbstractFactory_FurnitureFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        System.out.println("Victorian AbstractFactory_FurnitureFactory.Chair created");
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Victorian AbstractFactory_FurnitureFactory.Sofa created");
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        System.out.println("Victorian AbstractFactory_FurnitureFactory.Table created");
        return new VictorianTable();
    }
}
