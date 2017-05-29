package patterns.factory.factory_method.example1;

import patterns.factory.factory_method.example1.creator.PizzaStore;
import patterns.factory.factory_method.example1.creator.store.ChicagoPizzaStore;
import patterns.factory.factory_method.example1.creator.store.NYPizzaStore;
import patterns.factory.factory_method.example1.product.pizza.Pizza;
import patterns.factory.factory_method.example1.product.pizza.PizzaType;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
