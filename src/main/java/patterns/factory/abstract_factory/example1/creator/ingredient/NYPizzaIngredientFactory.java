package patterns.factory.abstract_factory.example1.creator.ingredient;

import patterns.factory.abstract_factory.example1.creator.PizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.product.ingredient.clams.Clams;
import patterns.factory.abstract_factory.example1.product.ingredient.clams.FreshClams;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.Cheese;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.ReggianoCheese;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.Dough;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.ThinCrustDough;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.Pepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.SlicedPepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.MarinaraSauce;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.Sauce;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
