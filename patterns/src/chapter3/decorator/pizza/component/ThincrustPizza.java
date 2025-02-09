package chapter3.decorator.pizza.component;

import chapter3.decorator.pizza.Pizza;

public class ThincrustPizza extends Pizza {

    public ThincrustPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
