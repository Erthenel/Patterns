package patterns.factory.abstract_factory.example1.creator.ingredient;

import patterns.factory.abstract_factory.example1.creator.PizzaIngredientFactory;
import patterns.factory.abstract_factory.example1.product.ingredient.clams.Clams;
import patterns.factory.abstract_factory.example1.product.ingredient.clams.FrozenClams;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.Cheese;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.Mozzarella;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.Dough;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.ThickCrustDough;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.Pepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.SlicedPepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.PlumTomatoSauce;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.Sauce;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.BlackOlives;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.EggPlant;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.Spinach;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new BlackOlives(),
                new EggPlant(),
                new Spinach()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
