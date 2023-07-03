package Mediator_GroupChat;

public abstract class User {
    protected String name;
    protected Mediator mediator;

    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
