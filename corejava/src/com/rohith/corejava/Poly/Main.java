package com.rohith.corejava.Poly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want ?");
        System.out.println("1). Cat  "+"2). Dog");
        int choice = scanner.nextInt();

        if (choice==1) {
            animal = new Cat();
        }
        else {
            if (choice==2) {
                animal = new Dog();
            }
            else {
                System.out.println("Invalid Choice");
                animal = new Animal();

            }
        }
        animal.speak();

    }
}
