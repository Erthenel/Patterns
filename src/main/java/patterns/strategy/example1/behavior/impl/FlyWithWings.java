package patterns.strategy.example1.behavior.impl;

import patterns.strategy.example1.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        // Implements duck flying
        System.out.println("I’m flying!");
    }
}
