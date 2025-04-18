package chapter10.state.concrete;

import chapter10.state.State;
import chapter10.state.context.TrafficLight;

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
