package Facade_OnlineStore;

public class Item {
    private String name;
    private int count;
    private double price;

    public Item(String name, int count, double price) {
        this.name = name.toLowerCase();
        this.count = count;
        this.price = price;
    }

    public void updateCount(int countNeeded){
        this.count -= countNeeded;
    }

    public String getName(){
        return name;
    }
}
