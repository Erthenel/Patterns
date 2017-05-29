package patterns.factory.abstract_factory.example1.product.pizza;

import patterns.factory.abstract_factory.example1.product.ingredient.clams.Clams;
import patterns.factory.abstract_factory.example1.product.ingredient.cheese.Cheese;
import patterns.factory.abstract_factory.example1.product.ingredient.dough.Dough;
import patterns.factory.abstract_factory.example1.product.ingredient.pepperoni.Pepperoni;
import patterns.factory.abstract_factory.example1.product.ingredient.sauce.Sauce;
import patterns.factory.abstract_factory.example1.product.ingredient.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                (dough == null ? "" : ", dough=" + dough) +
                (sauce == null ? "" : ", sauce=" + sauce) +
                (veggies == null ? "" : ", veggies=" + Arrays.toString(veggies)) +
                (cheese == null ? "" : ", cheese=" + cheese) +
                (pepperoni == null ? "" : ", pepperoni=" + pepperoni) +
                (clam == null ? "" : ", clam=" + clam);
    }
}
