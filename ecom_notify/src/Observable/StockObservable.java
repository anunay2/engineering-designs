package Observable;

import Observer.Notifier;

import java.util.List;

public interface StockObservable {
    List<Notifier> notifierList = null;
    public void add(Notifier notifier);
    public void remove(Notifier notifier);
    public void setStocks(int stockItems);
    public void notifyAllObservers();

    //void notifyAllObservers();
}
