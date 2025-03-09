package chapter4.factory.factoryMethod.stores.chicago;

import chapter4.factory.factoryMethod.Pizza;
import chapter4.factory.factoryMethod.PizzaStore;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleCheesePizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleClamPizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStylePepperoniPizza;
import chapter4.factory.factoryMethod.stores.chicago.pizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
