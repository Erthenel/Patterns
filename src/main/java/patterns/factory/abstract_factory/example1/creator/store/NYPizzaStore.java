package patterns.factory.abstract_factory.example1.creator.store;

import patterns.factory.abstract_factory.example1.creator.PizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.creator.PizzaStore;
import patterns.factory.abstract_factory.example1.creator.ingredient.NYPizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.product.pizza.CheesePizza;
import patterns.factory.abstract_factory.example1.product.pizza.ClamPizza;
import patterns.factory.abstract_factory.example1.product.pizza.Pizza;
import patterns.factory.abstract_factory.example1.product.pizza.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY Style Cheese Pizza");

                break;
            case CLAMS:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("NY Style Clam Pizza");

                break;
            default:
                throw new IllegalStateException("Pizza type is not supported!");
        }

        return pizza;
    }
}
