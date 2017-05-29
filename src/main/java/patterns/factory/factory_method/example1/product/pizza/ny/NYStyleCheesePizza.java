package patterns.factory.factory_method.example1.product.pizza.ny;

import patterns.factory.factory_method.example1.product.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
