package Behavioral.Mediator;

public class MediatorPatternExample {

    public static void main(String[] args) {
        // Create the mediator
        ChatMediatorImpl mediator = new ChatMediatorImpl();

        // Create users and add them to the mediator
        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Users communicate through the mediator
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
    }
}