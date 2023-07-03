package Facade_OnlineStore;

public class DeliveryBoy {
    private Item item;
    public void pickUpItem(Item item){
        this.item = item;
        System.out.println("Item picked up!");
    }

    public Item dropItem(){
        System.out.println("Item dropped!");
        return item;
    }
}
