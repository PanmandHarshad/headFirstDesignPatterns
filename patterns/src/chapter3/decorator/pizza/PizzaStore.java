package chapter3.decorator.pizza;

import chapter3.decorator.pizza.component.ThickcrustPizza;
import chapter3.decorator.pizza.decorators.Cheese;
import chapter3.decorator.pizza.decorators.Olive;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThickcrustPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());

        Pizza cheesePizza = new Cheese(pizza);
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.cost());

        Pizza olivePizza = new Olive(pizza);
        System.out.println(olivePizza.getDescription());
        System.out.println(olivePizza.cost());

        Pizza oliveCheese = new Olive(cheesePizza);
        System.out.println(oliveCheese.getDescription());
        System.out.println(oliveCheese.cost());

    }
}
