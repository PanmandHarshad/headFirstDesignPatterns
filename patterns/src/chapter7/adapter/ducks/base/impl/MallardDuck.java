package chapter7.adapter.ducks.base.impl;

import chapter7.adapter.ducks.base.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying long distance");
    }
}
