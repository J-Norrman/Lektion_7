package com.Joel.Lektion7_interfaceAbstract.models;
// Abstract class - marked by keyword: 'abstract'
// Can inherit from both: Interface and Abstract classes
public abstract class AAnimal {
    // Abstract method - excludes body: {}
    public abstract void eat();
    // Ordinary method - excludes abstract
    public void makeSound(){
        System.out.println("Squeak");
    }
}
