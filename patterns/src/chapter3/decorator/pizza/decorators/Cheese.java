package chapter3.decorator.pizza.decorators;

import chapter3.decorator.pizza.Pizza;
import chapter3.decorator.pizza.ToppingDecorator;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return pizza.cost(); // Cheese is free
    }
}
