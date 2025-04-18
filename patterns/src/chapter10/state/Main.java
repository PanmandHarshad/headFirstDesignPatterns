package chapter10.state;

import chapter10.state.context.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        // Simulate light changes
        for (int i = 0; i < 6; i++) {
            light.show();   // Display current state
            light.change(); // Move to next state
        }
    }
}

