package Behavioral.Observer;

class OnlineSubscriber implements Observer {

    private String subscriberName;

    public OnlineSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String newsUpdate) {
        System.out.println("Online Subscriber " + subscriberName + " received update: " + newsUpdate);
    }
}
