package patterns.strategy.example1.client;

import patterns.strategy.example1.behavior.impl.FlyNoWay;
import patterns.strategy.example1.behavior.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("It's a rubber duck: " + this.getClass());
    }
}
