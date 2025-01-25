package chapter1.strategy;

import chapter1.strategy.base.Duck;
import chapter1.strategy.ducks.MallardDuck;
import chapter1.strategy.ducks.ModelDuck;
import chapter1.strategy.behavior.impl.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("---------------------------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
