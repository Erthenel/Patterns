package patterns.strategy.example1.behavior.impl;

import patterns.strategy.example1.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        // Do nothing - I can't quack!
        System.out.println("I can't quack!");
    }
}
