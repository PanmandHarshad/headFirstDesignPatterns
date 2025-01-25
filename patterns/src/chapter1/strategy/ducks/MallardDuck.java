package chapter1.strategy.ducks;

import chapter1.strategy.base.Duck;
import chapter1.strategy.behavior.impl.fly.FlyWithWings;
import chapter1.strategy.behavior.impl.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
