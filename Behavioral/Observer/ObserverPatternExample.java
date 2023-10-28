package Behavioral.Observer;

public class ObserverPatternExample {

    public static void main(String[] args) {
        // Create the subject (NewsAgency)
        NewsAgency newsAgency = new NewsAgency();

        // Create observers (NewsChannels and OnlineSubscribers)
        Observer channel1 = new NewsChannel("Channel 1");
        Observer channel2 = new NewsChannel("Channel 2");
        Observer onlineSubscriber1 = new OnlineSubscriber("Subscriber 1");
        Observer onlineSubscriber2 = new OnlineSubscriber("Subscriber 2");

        // Register observers with the subject
        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);
        newsAgency.registerObserver(onlineSubscriber1);
        newsAgency.registerObserver(onlineSubscriber2);

        // Publish news, and observers will be notified
        newsAgency.publishNews("Breaking News: Important Event!");

        // Unregister one observer (Channel 1)
        newsAgency.removeObserver(channel1);

        // Publish more news, and remaining observers will be notified
        newsAgency.publishNews("Update: Weather Forecast");
    }
}
