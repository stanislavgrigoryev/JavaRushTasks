package com.javarush.task.jdk13.task41.task4102;

public class WithArugula extends PizzaDecorator{
    public WithArugula(Pizza decoratorPizza) {
        super(decoratorPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", руккола";
    }
}
