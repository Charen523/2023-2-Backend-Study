package org.example;

public abstract class Animal {
    public abstract void speak();
}
class Cat extends Animal{
    String name;
    public Cat(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(this.name + " says Meow!\n");
    }
}

class Dog extends Animal{
    String name;
    public Dog(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(this.name + " says Woof!\n");
    }
}
