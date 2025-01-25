package chapter1.strategy.ducks;

import chapter1.strategy.base.Duck;
import chapter1.strategy.behavior.impl.fly.FlyNoWay;
import chapter1.strategy.behavior.impl.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
