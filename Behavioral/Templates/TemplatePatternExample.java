package Behavioral.Templates;

public class TemplatePatternExample {

    public static void main(String[] args) {
        System.out.println("Making coffee with hook:");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.makeCoffee();

        System.out.println("\nMaking coffee without hook:");
        CoffeeWithoutHook coffeeWithoutHook = new CoffeeWithoutHook();
        coffeeWithoutHook.makeCoffee();
    }
}
