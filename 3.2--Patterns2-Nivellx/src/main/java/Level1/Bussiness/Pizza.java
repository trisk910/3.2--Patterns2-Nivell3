package Level1.Bussiness;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private float size;
    private String dough;
    private ArrayList<String> toppings;

    public Pizza(String name,float size, String dough, ArrayList<String> toppings) {
        this.name = name;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public float getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza "+ name+":{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
