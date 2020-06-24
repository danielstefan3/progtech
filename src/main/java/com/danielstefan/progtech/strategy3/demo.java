package com.danielstefan.progtech.strategy3;

public class demo {
    public static void main(String args[]) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.CoffeeChoosing(new WeakCoffee());
        coffeeMaker.CoffeeMaking();
        coffeeMaker.CoffeeChoosing(new NormalCoffee());
        coffeeMaker.CoffeeMaking();
        coffeeMaker.CoffeeChoosing(new StrongCoffee());
        coffeeMaker.CoffeeMaking();
    }
}
