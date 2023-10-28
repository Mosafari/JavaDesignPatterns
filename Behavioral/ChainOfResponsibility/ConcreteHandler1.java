package Behavioral.ChainOfResponsibility;

class ConcreteHandler1 implements Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE1)) {
            System.out.println("ConcreteHandler1 handling request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
