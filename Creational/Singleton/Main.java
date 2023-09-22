package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        // singletoninstance = new Singleton(); that dosen't work
        Singleton singletoninstance = Singleton.getInstance("creation msg");
        System.out.println(singletoninstance.msg);
        Singleton singletoninstance2 = Singleton.getInstance("another msg");
        System.out.println(singletoninstance2.msg); // dosen't assign "another msg" to msg var
    }
    
}
