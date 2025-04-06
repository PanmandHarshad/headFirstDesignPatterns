package chapter10;

import chapter10.context.TrafficLight;

public interface State {
    void next(TrafficLight light);

    void display();
}
