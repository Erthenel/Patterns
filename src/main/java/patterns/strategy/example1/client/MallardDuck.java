package patterns.strategy.example1.client;

import patterns.strategy.example1.behavior.impl.FlyWithWings;
import patterns.strategy.example1.behavior.impl.Quack;

public class MallardDuck extends Duck {
    public void display() {
        System.out.println("It's a mallard duck: " + this.getClass());
    }

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
