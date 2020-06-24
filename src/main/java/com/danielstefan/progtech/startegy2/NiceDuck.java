package com.danielstefan.progtech.startegy2;

public class NiceDuck extends Duck {

    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

    public NiceDuck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void Quack() {
        quackStrategy.Quack();
    }

    @Override
    public void Fly() {
        flyStrategy.Fly();
    }
}
