package Mediator_GroupChat;

public interface Mediator {
    void addUser(User user);
    void sendMessage(String msg, User currentUser);
}
