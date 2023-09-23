package Structural;

public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("Mongo.png");
        proxyImage.display();
        ProxyImage proxyImage2 = new ProxyImage("Banana.png");
        proxyImage2.display();
        proxyImage2.display(); // without loading
    }
    
}
