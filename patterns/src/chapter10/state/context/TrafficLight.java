package chapter10.state.context;

import chapter10.state.State;
import chapter10.state.concrete.RedState;

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
