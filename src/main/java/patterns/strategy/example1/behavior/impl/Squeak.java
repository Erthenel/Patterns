package patterns.strategy.example1.behavior.impl;

import patterns.strategy.example1.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        // Implements duck squeaking
        System.out.println("Squeak!");
    }
}
