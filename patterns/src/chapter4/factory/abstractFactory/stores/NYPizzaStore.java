package chapter4.factory.abstractFactory.stores;

import chapter4.factory.abstractFactory.Pizza;
import chapter4.factory.abstractFactory.PizzaIngredientFactory;
import chapter4.factory.abstractFactory.PizzaStore;
import chapter4.factory.abstractFactory.ingredients.factory.NYPizzaIngredientFactory;
import chapter4.factory.abstractFactory.pizzas.CheesePizza;
import chapter4.factory.abstractFactory.pizzas.ClamPizza;
import chapter4.factory.abstractFactory.pizzas.PepperoniPizza;
import chapter4.factory.abstractFactory.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }

            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }

            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }

            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
