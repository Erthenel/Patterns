package patterns.decorator.example1.type;

import patterns.decorator.example1.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return .22;
    }
}
