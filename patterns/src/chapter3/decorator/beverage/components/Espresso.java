package chapter3.decorator.beverage.components;

import chapter3.decorator.beverage.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
