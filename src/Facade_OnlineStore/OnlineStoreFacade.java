package Facade_OnlineStore;

import java.util.ArrayList;
import java.util.Queue;

public class OnlineStoreFacade {
    private Shop shop;
    private DeliveryDepartment deliveryDepartment;
    private DeliveryBoy deliveryBoy;
    private ArrayList<Item> history;

    public OnlineStoreFacade(){
        shop = new Shop();
        deliveryDepartment = new DeliveryDepartment();
        history = new ArrayList<>();
    }

    public Item placeOrder(String name){
        System.out.println("Order processing...");
        Item item = shop.getItem(name);
        if(item == null){
            System.out.println("Oops! Item not found.");
            return null;
        }
        System.out.println("Order placed.");
        //if item exists
        history.add(item);
        deliveryBoy = deliveryDepartment.assignDeliveryBoy();
        deliveryBoy.pickUpItem(item);
        System.out.println("delivering...");
        return deliveryBoy.dropItem();
    }

    public void viewHistory(){
        System.out.println("History:");
        for(Item item: history){
            System.out.println(item.getName());
        }
    }
}
