package Behavioral.State;

public class StatePatternExample {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate multiple cycles of the traffic light
        for (int i = 0; i < 3; i++) {
            trafficLight.request(); // Cycle through Red, Yellow, Green
        }
    }
}
