package FlyWeight_ForestCreator;

public class Tree {
    private double positionX;
    private double positionY;
    private TreeData treeData;

    public Tree(double positionX, double positionY, TreeType type) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.treeData = TreeDataFactory.getTreeData(type);
    }

    @Override
    public String toString() {
        return "Tree{" + "positionX=" + positionX + ", positionY=" + positionY + ", treeData=" + treeData + '}';
    }
}
