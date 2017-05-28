package patterns.strategy.example1.behavior.impl;

import patterns.strategy.example1.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // Implements duck quacking
        System.out.println("Quack!");
    }
}
