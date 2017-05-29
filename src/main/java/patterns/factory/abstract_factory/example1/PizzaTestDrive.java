package patterns.factory.abstract_factory.example1;

import patterns.factory.abstract_factory.example1.creator.PizzaStore;
import patterns.factory.abstract_factory.example1.creator.store.ChicagoPizzaStore;
import patterns.factory.abstract_factory.example1.creator.store.NYPizzaStore;
import patterns.factory.abstract_factory.example1.product.pizza.Pizza;
import patterns.factory.abstract_factory.example1.product.pizza.PizzaType;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizza pizza = null;

        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza(PizzaType.CLAMS);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyPizzaStore.orderPizza(PizzaType.CLAMS);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
