package Observer;

import Observable.StockObservable;

public class MobileAppNotifier implements Notifier{
    StockObservable stockObservable;

    public MobileAppNotifier(StockObservable stockObservable){
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("No more stocks");
    }
}
