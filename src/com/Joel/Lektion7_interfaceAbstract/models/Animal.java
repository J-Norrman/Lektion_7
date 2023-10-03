package com.Joel.Lektion7_interfaceAbstract.models;

// Abstract - Inheritance
// By default, methods are 'public'
// Uses keyword: implements
public interface Animal {
    void name();

    // Abstract method
    void move();
    void eat();
    void sleep();
    void makeSound();
    default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);
    }
}
