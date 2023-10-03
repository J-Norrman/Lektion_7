package com.Joel.Lektion7_interfaceAbstract.models;

public class Cat implements Animal{

    @Override
    public void name() {
        System.out.println("Douglass");
    }

    @Override
    public void move() {
        System.out.println("0km/h");
    }

    @Override
    public void eat() {
        System.out.println("Eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 100% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
