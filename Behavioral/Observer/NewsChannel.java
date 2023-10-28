package Behavioral.Observer;

class NewsChannel implements Observer {

    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String newsUpdate) {
        System.out.println("News Channel " + channelName + " received update: " + newsUpdate);
    }
}