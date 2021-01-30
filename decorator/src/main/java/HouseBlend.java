// Concrete Component

public class HouseBlend implements Beverage {
    @Override
    public String getDesc() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
