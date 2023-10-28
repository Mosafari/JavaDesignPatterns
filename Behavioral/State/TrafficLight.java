package Behavioral.State;

class TrafficLight {

    private TrafficLightState currentState;

    public TrafficLight() {
        // Initial state is Red
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handleRequest(this);
    }
}
