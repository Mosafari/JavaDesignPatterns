package Behavioral.Templates;

class CoffeeWithHook extends CoffeeTemplate {

    @Override
    void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}