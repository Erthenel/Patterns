package patterns.strategy.example1.client;


import patterns.strategy.example1.behavior.impl.FlyNoWay;
import patterns.strategy.example1.behavior.impl.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("It's a model duck: " + this.getClass());
    }
}
