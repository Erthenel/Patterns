package patterns.factory.abstract_factory.example1.creator.store;

import patterns.factory.abstract_factory.example1.creator.PizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.creator.PizzaStore;
import patterns.factory.abstract_factory.example1.creator.ingredient.ChicagoPizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.product.pizza.CheesePizza;
import patterns.factory.abstract_factory.example1.product.pizza.ClamPizza;
import patterns.factory.abstract_factory.example1.product.pizza.Pizza;
import patterns.factory.abstract_factory.example1.product.pizza.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");

                break;

            case CLAMS:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");

                break;
            default:
                throw new IllegalStateException("Pizza type is not supported!");
        }

        return pizza;
    }
}
