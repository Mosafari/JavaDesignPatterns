package Structural.Facade;

public class Dog implements IAnimal{

    @Override
    public void food() {
        System.out.println("Dog food");
    }

    @Override
    public void talk() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println("Runnnn");
    }
    
}
