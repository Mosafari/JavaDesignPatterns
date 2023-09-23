package Structural.Decorator;

public class SugarDecorator implements CoffeeDecorator{
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Suger";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }

    
}
