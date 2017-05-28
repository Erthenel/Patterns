package patterns.strategy.example1.behavior.impl;

import patterns.strategy.example1.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // Do nothing - I can't fly!
        System.out.println("I can’t fly!");
    }
}
