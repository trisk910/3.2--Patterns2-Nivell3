package Level2.Bussiness;

import Level2.Bussiness.Interfaces.Observer;

public class StockAgency implements Observer {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockValue) {
        System.out.println("Agency " + name + " observed. New value: " + stockValue);
    }
}
