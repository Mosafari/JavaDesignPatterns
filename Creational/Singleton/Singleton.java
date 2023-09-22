package Creational.Singleton;

public class Singleton {
    private static Singleton instance = null;
    String msg ;

    private Singleton(String msg){
        this.msg = msg;
    }

    public static Singleton getInstance(String msg){
        if(instance == null){
            instance = new Singleton(msg);
        }
        return instance;
    }
}
