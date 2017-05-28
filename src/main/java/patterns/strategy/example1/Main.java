package patterns.strategy.example1;

import patterns.strategy.example1.client.MallardDuck;
import patterns.strategy.example1.client.Duck;
import patterns.strategy.example1.client.ModelDuck;
import patterns.strategy.example1.client.RubberDuck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Strategy - defines a family of algorithms, encapsulates each one,
* and makes them interchangeable. Strategy lets the algorithm vary
* independently from clients that use it.
 */

public class Main {

    public static void main(String[] args) {
        List<Duck> list = new ArrayList<Duck>();

        Collections.addAll(
                list,
                new MallardDuck(),
                new RubberDuck(),
                new ModelDuck());

        list.forEach(duck -> {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
        });

    }
}
