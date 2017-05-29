package patterns.factory.factory_method.example1.creator.store;

import patterns.factory.factory_method.example1.creator.PizzaStore;
import patterns.factory.factory_method.example1.product.pizza.Pizza;
import patterns.factory.factory_method.example1.product.pizza.PizzaType;
import patterns.factory.factory_method.example1.product.pizza.ny.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYStyleCheesePizza();
            default:
                throw new IllegalStateException("Pizza type is not supported!");
        }
    }
}
