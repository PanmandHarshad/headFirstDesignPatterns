package chapter4.factory.abstractFactory.ingredients.factory;

import chapter4.factory.abstractFactory.PizzaIngredientFactory;
import chapter4.factory.abstractFactory.ingredients.*;
import chapter4.factory.abstractFactory.ingredients.types.Cheesetypes.MozzarellaCheese;
import chapter4.factory.abstractFactory.ingredients.types.Clamstypes.FrozenClams;
import chapter4.factory.abstractFactory.ingredients.types.Doughtypes.ThickCrustDough;
import chapter4.factory.abstractFactory.ingredients.types.Pepperonitypes.SlicedPepperoni;
import chapter4.factory.abstractFactory.ingredients.types.Saucetypes.PlumTomatoSauce;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.BlackOlives;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.Eggplant;
import chapter4.factory.abstractFactory.ingredients.types.Veggiestypes.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
