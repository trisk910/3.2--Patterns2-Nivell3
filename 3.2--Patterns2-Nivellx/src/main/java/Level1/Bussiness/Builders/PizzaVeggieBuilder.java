package Level1.Bussiness.Builders;

import Level1.Bussiness.Interfaces.PizzaBuilder;
import Level1.Bussiness.Pizza;

import java.util.ArrayList;

public class PizzaVeggieBuilder implements PizzaBuilder {
    private static final String name = "Veggie";
    private float size;
    private String dough;
    private ArrayList<String> toppings;

    @Override
    public PizzaBuilder setSize(float size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(name,size, dough, toppings);
    }
}
