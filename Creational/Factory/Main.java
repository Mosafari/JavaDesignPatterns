package Creational.Factory;

public class Main{
    public static void main(String[] args) {
        Factory factory = new TypeFactory();
        Message info = factory.addMessage("info");
        info.print("it's rainy out there");
        Message user = factory.addMessage("user");
        user.print("I know!!!");

    }
}