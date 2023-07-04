package State_PhoneScreen;

public class Phone {
    private State state;

    public Phone(){
        this.state = new ScreenOffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressHomeBtn(){
        state.pressHomeBtn();
    }
    public void pressPowerBtn(){
        state.pressPowerBtn();
    }

}
