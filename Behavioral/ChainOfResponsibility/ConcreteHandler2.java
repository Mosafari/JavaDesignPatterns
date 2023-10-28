package Behavioral.ChainOfResponsibility;

class ConcreteHandler2 implements Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE2)) {
            System.out.println("ConcreteHandler2 handling request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}