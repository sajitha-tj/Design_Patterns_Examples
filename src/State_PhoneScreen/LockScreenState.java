package State_PhoneScreen;

public class LockScreenState extends State{
    public LockScreenState(Phone phone) {
        super(phone);
        System.out.println("LockScreenState");
    }

    @Override
    public void pressHomeBtn() {
        System.out.println("Pressing Home button");
        phone.setState(new HomeScreen(phone));
    }

    @Override
    public void pressPowerBtn() {
        System.out.println("Pressing Power button");
        phone.setState(new ScreenOffState(phone));
    }
}
