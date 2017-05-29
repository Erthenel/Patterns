package patterns.decorator.example1.deco;

import patterns.decorator.example1.Beverage;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
