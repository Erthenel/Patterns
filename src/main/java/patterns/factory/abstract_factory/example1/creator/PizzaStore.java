package patterns.factory.abstract_factory.example1.creator;

import patterns.factory.abstract_factory.example1.product.pizza.Pizza;
import patterns.factory.abstract_factory.example1.product.pizza.PizzaType;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
