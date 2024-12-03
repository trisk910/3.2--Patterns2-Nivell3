package Level2.Bussiness;

import Level2.Bussiness.Interfaces.Observable;
import Level2.Bussiness.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable {
    private List<Observer> observers;
    private float stockValue;

    public StockAgent() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockValue);
        }
    }

    public void setStockValue(float stockValue) {
        this.stockValue = stockValue;
        notifyObservers();
    }
}
