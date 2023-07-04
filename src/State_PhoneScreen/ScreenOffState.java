package State_PhoneScreen;

public class ScreenOffState extends State{
    public ScreenOffState(Phone phone) {
        super(phone);
        System.out.println("ScreenOffState");
    }

    @Override
    public void pressHomeBtn() {
        System.out.println("pressing Home button");
        phone.setState(new LockScreenState(phone));
    }

    @Override
    public void pressPowerBtn() {
        System.out.println("Pressing Power button");
        phone.setState(new LockScreenState(phone));
    }
}
