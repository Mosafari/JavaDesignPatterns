package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Description: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.cost());

        Coffee milkCoffee = new MilkDecorator(espresso);
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Description: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarMilkCoffee.cost());
    }
    
}
