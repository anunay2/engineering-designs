package Observer;

import Observable.StockObservable;

public class EmailNotifier implements Notifier{
    StockObservable stockObservable;
    public EmailNotifier(StockObservable stockObservable){
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("No more stocks");
    }
}
