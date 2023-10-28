package Behavioral.Templates;

abstract class CoffeeTemplate {

    // Template method defining the algorithm
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrounds();
        pourInCup();
        addCondiments();
        System.out.println("Coffee is ready!");
    }

    // These steps are common and will not change
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // These steps can be overridden by subclasses
    abstract void brewCoffeeGrounds();

    abstract void addCondiments();
}