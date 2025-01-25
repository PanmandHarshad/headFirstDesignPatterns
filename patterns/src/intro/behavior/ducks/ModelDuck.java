package intro.behavior.ducks;

import intro.behavior.base.Duck;
import intro.behavior.impl.fly.FlyNoWay;
import intro.behavior.impl.quack.Quack;

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
