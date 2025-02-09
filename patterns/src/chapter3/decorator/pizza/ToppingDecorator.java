package chapter3.decorator.pizza;

public abstract class ToppingDecorator extends Pizza {
    protected Pizza pizza;

    public abstract String getDescription();
}
