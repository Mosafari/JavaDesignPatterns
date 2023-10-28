package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User u : users) {
            // Send the message to all users except the sender
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}