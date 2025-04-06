package chapter10.context;

import chapter10.State;
import chapter10.concrete.RedState;

public class TrafficLight {
    private State state;

    public TrafficLight() {
        // Initial state
        this.state = new RedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void change() {
        state.next(this);
    }

    public void show() {
        state.display();
    }
}
