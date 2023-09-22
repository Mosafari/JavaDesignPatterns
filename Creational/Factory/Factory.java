package Creational.Factory;

public abstract class Factory {
    public Message addMessage(String messagetype ){
        Message message;
        // using factory method
        message = createMessage(messagetype);

        return message;
    }
    abstract public Message createMessage(String messagetype);
    
}
