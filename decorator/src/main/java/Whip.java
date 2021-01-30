public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
