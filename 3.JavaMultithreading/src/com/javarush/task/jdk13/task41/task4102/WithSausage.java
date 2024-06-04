package com.javarush.task.jdk13.task41.task4102;

public class WithSausage extends PizzaDecorator {

    protected WithSausage(Pizza decoratorPizza) {
        super(decoratorPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }
}
