package FlyWeight_ForestCreator;

public class TreeData {
    private String type;
    private String colour;
    private boolean haveFruits;

    public TreeData(String type, String colour, boolean haveFruits) {
        this.type = type;
        this.colour = colour;
        this.haveFruits = haveFruits;
    }

    @Override
    public String toString() {
        return "TreeData{" + "type=" + type + ", colour=" + colour + ", haveFruits=" + haveFruits + '}';
    }
}
