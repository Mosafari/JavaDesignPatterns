package Creational.Factory;

public class TypeFactory extends Factory{
    public Message createMessage(String messagetype){
        if (messagetype.equals("info")){
            return new InfoMessage();
        }else if (messagetype.equals("user")){
            return new UserMessage();
        }
        return  null;
    }
    
}
