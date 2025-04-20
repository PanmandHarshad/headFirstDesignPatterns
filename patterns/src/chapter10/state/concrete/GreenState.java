package chapter10.state.concrete;

import chapter10.state.State;
import chapter10.state.context.TrafficLight;

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
