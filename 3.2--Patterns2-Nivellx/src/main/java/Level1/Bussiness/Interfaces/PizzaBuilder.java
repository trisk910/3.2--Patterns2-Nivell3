package Level1.Bussiness.Interfaces;


import Level1.Bussiness.Pizza;

import java.util.ArrayList;

public interface PizzaBuilder {
    PizzaBuilder setSize(float size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(ArrayList<String> toppings);
    Pizza build();
}
