package chapter10.concrete;

import chapter10.State;
import chapter10.context.TrafficLight;

public class YellowState implements State {
    @Override
    public void next(TrafficLight light) {
        light.setState(new RedState());
    }

    @Override
    public void display() {
        System.out.println("Yellow Light – SLOW DOWN!");
    }
}
