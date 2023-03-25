import Observable.GadgetsStockObservableImpl;
import Observable.StockObservable;
import Observer.EmailNotifier;
import Observer.MobileAppNotifier;
import Observer.Notifier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StockObservable stockObservable = new GadgetsStockObservableImpl();
        Notifier emailNotifier = new EmailNotifier(stockObservable);
        Notifier mobileAppNotifier = new MobileAppNotifier(stockObservable);
        stockObservable.add(emailNotifier);
        stockObservable.add(mobileAppNotifier);
        // since all the stocks are 0 all types of notifier will be notified
        stockObservable.setStocks(4);
        stockObservable.setStocks(23);

    }
}