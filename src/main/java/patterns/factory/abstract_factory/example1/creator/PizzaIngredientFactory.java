package patterns.factory.abstract_factory.example1.creator;


import patterns.factory.abstract_factory.example1.product.ingredient.clams.Clams;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.Cheese;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.Dough;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.Pepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.Sauce;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
