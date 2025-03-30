package chapter8.templatemethod;

public abstract class CaffeineBeverage {

    // Template method defining the algorithm
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();  // Subclasses define this

    protected abstract void addCondiments(); // Subclasses define this

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
