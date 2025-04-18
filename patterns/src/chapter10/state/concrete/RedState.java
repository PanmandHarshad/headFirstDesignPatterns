package chapter10.state.concrete;

import chapter10.state.State;
import chapter10.state.context.TrafficLight;

public class RedState implements State {
    @Override
    public void next(TrafficLight light) {
        light.setState(new GreenState());
    }

    @Override
    public void display() {
        System.out.println("Red Light – STOP!");
    }
}
