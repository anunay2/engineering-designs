package Observable;

import Observer.Notifier;

import java.util.ArrayList;
import java.util.List;

public class GadgetsStockObservableImpl implements StockObservable{

    List<Notifier> notifierList;
    int itemsInStocks;

    public GadgetsStockObservableImpl(){
        this.notifierList = new ArrayList<>();
        this.itemsInStocks = 0;
    }

    @Override
    public void add(Notifier notifier) {
        notifierList.add(notifier);
    }

    @Override
    public void remove(Notifier notifier) {
        notifierList.remove(notifier);
    }

    @Override
    public void setStocks(int stockItemAdded) {
        if( itemsInStocks == 0){
            notifyAllObservers();
        }
        itemsInStocks+= stockItemAdded;

    }

    @Override
    public void notifyAllObservers() {
        for( Notifier notifier : notifierList){
            notifier.update();
        }
    }
}
