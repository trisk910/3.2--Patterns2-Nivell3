package Level1.Bussiness;

import Level1.Bussiness.Interfaces.PizzaBuilder;

import java.util.ArrayList;

public class PizzaMaster {
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza constructPizza(float size, String dough, ArrayList<String> toppings) {
        return pizzaBuilder.setSize(size)
                .setDough(dough)
                .setToppings(toppings)
                .build();
    }
}
