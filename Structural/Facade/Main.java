package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        int firstDog = petStore.adoptPet("dog");
        IAnimal firstD = petStore.getPet(firstDog);
        firstD.food();

        int firstCat = petStore.adoptPet("cat");
        IAnimal firstC = petStore.getPet(firstCat);
        firstC.food();

    }
    
}
