package Behavioral.State;


class YellowState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Yellow Light. Prepare to stop.");

        // Simulate a time delay for demonstration purposes
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change the state to Green
        trafficLight.setState(new GreenState());
    }
}
