package FlyWeight_ForestCreator;

public class Main {
    public static void main(String[] args) {
        TreeDataFactory treeDataFactory = new TreeDataFactory();

        Tree tree1 = new Tree(0,2,TreeType.TREE);
        Tree tree2 = new Tree(10,3,TreeType.VEIN);
        Tree tree3 = new Tree(5,4,TreeType.PLANT);
        Tree tree4 = new Tree(7,5,TreeType.TREE);

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
    }
}
