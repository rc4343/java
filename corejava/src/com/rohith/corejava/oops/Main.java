package com.rohith.corejava.oops;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Nick",30,65);
        Person person2 = new Person("jack",25,76);

        person1.eat();
        person2.dance();
        person2.weight();
        person1.age();
    }
}
