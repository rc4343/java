package com.rohith.corejava.oops;

public class Person {

    String name;
    int age;
    double weight;

    Person(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void dance() {
        System.out.println(this.name + " is dancing");
    }
    void age() {
        System.out.println(this.name +" is " + this.age +" years old");
    }
    void weight() {
        System.out.println(this.name+" weight is "+this.weight+"kg");
    }
}
