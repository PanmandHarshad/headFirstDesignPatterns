package chapter10.concrete;

import chapter10.State;
import chapter10.context.TrafficLight;

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
