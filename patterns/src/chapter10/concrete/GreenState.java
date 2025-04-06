package chapter10.concrete;

import chapter10.State;
import chapter10.context.TrafficLight;

public class GreenState implements State {
    @Override
    public void next(TrafficLight light) {
        light.setState(new YellowState());
    }

    @Override
    public void display() {
        System.out.println("Green Light – GO!");
    }
}
