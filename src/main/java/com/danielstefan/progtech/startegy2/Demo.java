package com.danielstefan.progtech.startegy2;

public class Demo {
    public static void main (String args[]) {
        Duck donald = new NiceDuck(
                new NotFly(),
                new BadQuack()
        );
        donald.Quack();
        donald.Fly();
    }
}
