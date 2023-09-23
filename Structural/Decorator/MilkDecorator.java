package Structural.Decorator;

public class MilkDecorator implements CoffeeDecorator{
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
    
}
