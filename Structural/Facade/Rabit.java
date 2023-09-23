package Structural.Facade;

public class Rabit implements IAnimal {

    @Override
    public void food() {
        System.out.println("Carrot");
    }

    @Override
    public void talk() {
        System.out.println("Clucking");
    }

    @Override
    public void walk() {
        System.out.println("Jump");
    }
    
}
