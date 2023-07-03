package Mediator_GroupChat;

public class ChatUser extends User{

    public ChatUser(String name, Mediator mediator) {
        super(name, mediator);
        mediator.addUser(this);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " is sending msg: " + msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received msg: " + msg);
    }
}
