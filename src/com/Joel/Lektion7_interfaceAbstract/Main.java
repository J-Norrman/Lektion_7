package com.Joel.Lektion7_interfaceAbstract;

// Inheritance and polymorphism

import com.Joel.Lektion7_interfaceAbstract.models.Cat;
import com.Joel.Lektion7_interfaceAbstract.models.Dog;
import com.Joel.Lektion7_interfaceAbstract.models.Squirrel;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Cat douglass = new Cat();
        Dog catniss = new Dog();
        Squirrel bob = new Squirrel();

        bob.eat();          // Abstract Method - Implementation
        bob.makeSound();    // Ordinary method

        douglass.typeOfAnimal("Cat"); // Default Method
        douglass.name();
        douglass.move();
        douglass.eat();
        douglass.sleep();
        douglass.makeSound();

        catniss.typeOfAnimal("Dog"); // Default Method
        catniss.name();
        catniss.move();
        catniss.eat();
        catniss.sleep();
        catniss.makeSound();

    }
}
