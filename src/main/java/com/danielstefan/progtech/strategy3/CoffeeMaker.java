package com.danielstefan.progtech.strategy3;

public class CoffeeMaker {
    private CoffeeStrategy coffeeStrategy;

    public void CoffeeChoosing(CoffeeStrategy cS) {
        coffeeStrategy = cS;
    }
    public void CoffeeMaking() {
        coffeeStrategy.MakingCoffee();
    }
}
