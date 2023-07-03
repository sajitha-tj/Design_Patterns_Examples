package Facade_OnlineStore;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private HashMap<String, Item> itemSet = new HashMap<>();

    public Shop(){
        itemSet.put("sugar",new Item("Sugar",10,100.0));
        itemSet.put("soap",new Item("soap",15,180.0));
        itemSet.put("rice",new Item("rice",20,120.0));
        itemSet.put("banana",new Item("banana",15,60.0));
        itemSet.put("milk",new Item("milk",4,150.0));
    }

    public Item getItem(String name){
        Item item = itemSet.get(name.toLowerCase());
        if(item != null){
            item.updateCount(1);
        }
        return item;
    }
}
