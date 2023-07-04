package State_PhoneScreen;

public abstract class State {
    protected Phone phone;

    public State(Phone phone){
        this.phone = phone;
    }
    public abstract void pressHomeBtn();
    public abstract void pressPowerBtn();
}
