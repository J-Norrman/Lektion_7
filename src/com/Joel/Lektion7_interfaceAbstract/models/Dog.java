package com.Joel.Lektion7_interfaceAbstract.models;

public class Dog implements Animal{

    @Override
    public void name() {
        System.out.println("Catniss");
    }

    @Override
    public void move() {
        System.out.println("45km/h");
    }
    @Override
    public void eat() {
        System.out.println("Eats cat");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of the time");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof, Bark");
    }
}
