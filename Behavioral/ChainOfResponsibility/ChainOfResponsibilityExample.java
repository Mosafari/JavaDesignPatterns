package Behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        // Creating the chain of handlers
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);

        // Creating requests
        Request request1 = new Request(RequestType.TYPE1);
        Request request2 = new Request(RequestType.TYPE2);

        // Sending requests through the chain
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}