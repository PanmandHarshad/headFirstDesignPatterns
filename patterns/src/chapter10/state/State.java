package chapter10.state;

import chapter10.state.context.TrafficLight;

public interface State {
    void next(TrafficLight light);

    void display();
}
