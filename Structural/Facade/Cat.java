package Structural.Facade;

public class Cat implements IAnimal {
    @Override
    public void food() {
        System.out.println("Fish");
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        System.out.println("cat walk");
    }
    
}
