package Facade_OnlineStore;

public class Main {
    public static void main(String[] args) {
        OnlineStoreFacade onlineStore = new OnlineStoreFacade();

        onlineStore.placeOrder("Sugar");
        onlineStore.placeOrder("milk");
        onlineStore.placeOrder("eggs");
        onlineStore.viewHistory();
        onlineStore.placeOrder("Rice");
        onlineStore.viewHistory();
    }
}
