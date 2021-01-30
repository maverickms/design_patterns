// Concrete Component

public class Espresso implements Beverage {
    public Espresso() {
    }

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
