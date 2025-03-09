package chapter4.factory.simple;

import chapter4.factory.simple.pizzas.CheesePizza;
import chapter4.factory.simple.pizzas.ClamPizza;
import chapter4.factory.simple.pizzas.PepperoniPizza;
import chapter4.factory.simple.pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
