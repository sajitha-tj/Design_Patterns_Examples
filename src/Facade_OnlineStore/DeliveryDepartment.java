package Facade_OnlineStore;

public class DeliveryDepartment {

    public DeliveryBoy assignDeliveryBoy(){
        System.out.println("delivery boy assigned.");
        return new DeliveryBoy();
    }
}
