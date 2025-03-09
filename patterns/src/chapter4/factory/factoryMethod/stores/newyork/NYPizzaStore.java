package chapter4.factory.factoryMethod.stores.newyork;

import chapter4.factory.factoryMethod.Pizza;
import chapter4.factory.factoryMethod.PizzaStore;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleCheesePizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleClamPizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStylePepperoniPizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }

}
