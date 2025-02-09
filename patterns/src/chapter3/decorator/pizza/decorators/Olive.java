package chapter3.decorator.pizza.decorators;

import chapter3.decorator.pizza.Pizza;
import chapter3.decorator.pizza.ToppingDecorator;

public class Olive extends ToppingDecorator {

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return pizza.cost() + 0.30;
    }
}
