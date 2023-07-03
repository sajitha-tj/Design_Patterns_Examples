package ChainOfResponsibility_LogInSystem;

public abstract class LogInHandler {
    LogInHandler next;

    public void setNext(LogInHandler nextHandler){
        this.next = nextHandler;
    }

    public abstract Account handleLogIn(LogInData logInData);
}
