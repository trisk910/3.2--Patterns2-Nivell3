package Level2.Bussiness.Interfaces;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
