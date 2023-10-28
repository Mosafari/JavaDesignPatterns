package Behavioral.State;

class RedState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Red Light. Stop!");

        // Simulate a time delay for demonstration purposes
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change the state to Yellow
        trafficLight.setState(new YellowState());
    }
}

