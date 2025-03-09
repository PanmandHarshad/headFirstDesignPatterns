package chapter4.factory.abstractFactory.ingredients.factory;

import chapter4.factory.abstractFactory.PizzaIngredientFactory;
import chapter4.factory.abstractFactory.ingredients.*;
import chapter4.factory.abstractFactory.ingredients.types.Cheesetypes.ReggianoCheese;
import chapter4.factory.abstractFactory.ingredients.types.Clamstypes.FreshClams;
import chapter4.factory.abstractFactory.ingredients.types.Doughtypes.ThinCrustDough;
import chapter4.factory.abstractFactory.ingredients.types.Pepperonitypes.SlicedPepperoni;
import chapter4.factory.abstractFactory.ingredients.types.Saucetypes.MarinaraSauce;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.Garlic;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.Mushroom;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.Onion;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.RedPepper;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
