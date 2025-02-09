package chapter3.decorator.beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
