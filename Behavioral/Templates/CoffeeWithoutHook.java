package Behavioral.Templates;

class CoffeeWithoutHook extends CoffeeTemplate {

    @Override
    void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    void addCondiments() {
        // Do nothing, no condiments for black coffee
    }
}