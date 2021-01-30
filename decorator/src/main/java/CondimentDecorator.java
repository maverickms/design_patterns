// Base Decorator

public class CondimentDecorator implements Beverage {
    Beverage beverage = null;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
