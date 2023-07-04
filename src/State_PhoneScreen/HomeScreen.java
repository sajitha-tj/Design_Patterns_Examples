package State_PhoneScreen;

public class HomeScreen extends State{

    public HomeScreen(Phone phone) {
        super(phone);
        System.out.println("HomeState");
    }

    @Override
    public void pressHomeBtn() {
        System.out.println("Pressing Power button");
        phone.setState(new ScreenOffState(phone));
    }

    @Override
    public void pressPowerBtn() {
        System.out.println("Pressing Power button");
        phone.setState(new ScreenOffState(phone));
    }
}
