package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        Adapter adapter = new Adapter(oldSystem);

        adapter.newStuff();
    }
    
}
