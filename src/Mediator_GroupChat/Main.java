package Mediator_GroupChat;

public class Main {
    public static void main(String[] args) {
        Mediator cm = new ChatMediator();
        User user1 = new ChatUser("John",cm);
        User user2 = new ChatUser("Smith",cm);
        User user3 = new ChatUser("Dave",cm);

//        cm.addUser(user1);
//        cm.addUser(user2);
//        cm.addUser(user3);
//        This is done inside the constructor of ChatUser

        user1.send("Hello guys!");
        user2.send("Hey!!");
        user1.send("Where is Dave?");
        user1.send("Have you seen him?");
        user2.send("I think he is here");
        user3.send("Hello!");
        user3.send("Yeah! I'm here");

    }
}
