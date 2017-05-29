package patterns.decorator.example1.type;

import patterns.decorator.example1.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .77;
    }
}
