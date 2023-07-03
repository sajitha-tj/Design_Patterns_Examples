package Mediator_GroupChat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{
    private List<User> users;

    public ChatMediator(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User currentUser) {
        for(User user : users){
            if(user != currentUser){
                user.receive(msg);
            }
        }
    }
}
