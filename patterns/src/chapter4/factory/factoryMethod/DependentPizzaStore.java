package chapter4.factory.factoryMethod;

import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleCheesePizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleClamPizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStylePepperoniPizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleVeggiePizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleCheesePizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleClamPizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStylePepperoniPizza;
import chapter4.factory.factoryMethod.stores.newyork.pizzas.NYStyleVeggiePizza;

public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            pizza = switch (type) {
                case "cheese" -> new NYStyleCheesePizza();
                case "veggie" -> new NYStyleVeggiePizza();
                case "clam" -> new NYStyleClamPizza();
                case "pepperoni" -> new NYStylePepperoniPizza();
                default -> pizza;
            };
        } else if (style.equals("Chicago")) {
            pizza = switch (type) {
                case "cheese" -> new ChicagoStyleCheesePizza();
                case "veggie" -> new ChicagoStyleVeggiePizza();
                case "clam" -> new ChicagoStyleClamPizza();
                case "pepperoni" -> new ChicagoStylePepperoniPizza();
                default -> pizza;
            };
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
