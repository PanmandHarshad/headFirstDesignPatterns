package intro.behavior.ducks;

import intro.behavior.base.Duck;
import intro.behavior.impl.fly.FlyWithWings;
import intro.behavior.impl.quack.Quack;

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
