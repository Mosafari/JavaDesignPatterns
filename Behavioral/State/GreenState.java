package Behavioral.State;


class GreenState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Green Light. Go!");

        // Simulate a time delay for demonstration purposes
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change the state to Red
        trafficLight.setState(new RedState());
    }
}
