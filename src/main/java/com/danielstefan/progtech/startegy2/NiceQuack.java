package com.danielstefan.progtech.startegy2;

abstract class NiceQuack extends QuackStrategy {
    @Override
    public void Quack() {
        System.out.println("QuackQuack!");
    }
}
