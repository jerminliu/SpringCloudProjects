package com.jermin.pattern.decoratorpattern;

public class ManDecoratorA extends Decorator {
    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA class");
    }

    public void reEat(){
        System.out.println("Eat one more");
    }
}
