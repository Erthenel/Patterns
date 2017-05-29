package patterns.decorator.example1;

import patterns.decorator.example1.deco.Milk;
import patterns.decorator.example1.deco.Mocha;
import patterns.decorator.example1.deco.Soy;
import patterns.decorator.example1.type.DarkRoast;
import patterns.decorator.example1.type.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println("Order: " + beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println("Order: " + beverage2.getDescription() + " $" + beverage2.cost());
    }
}