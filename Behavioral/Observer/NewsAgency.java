package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Subject {

    private List<Observer> observers;
    private String latestNewsUpdate;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String newsUpdate) {
        this.latestNewsUpdate = newsUpdate;
        for (Observer observer : observers) {
            observer.update(newsUpdate);
        }
    }

    public void publishNews(String newsUpdate) {
        System.out.println("News Agency publishes: " + newsUpdate);
        notifyObservers(newsUpdate);
    }
}
