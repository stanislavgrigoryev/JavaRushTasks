package com.javarush.task.jdk13.task41.task4102;

public abstract class PizzaDecorator implements Pizza{
   private final Pizza decoratedPizza;

   public PizzaDecorator(Pizza decoratorPizza) {
      this.decoratedPizza = decoratorPizza;
   }

   @Override
   public double getCost() {
      return decoratedPizza.getCost();
   }

   @Override
   public String getIngredients() {
      return decoratedPizza.getIngredients();
   }
}
