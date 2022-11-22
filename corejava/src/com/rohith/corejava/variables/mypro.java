package com.rohith.corejava.variables;

import java.util.Scanner;

public class mypro {


    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age?");
        age = scanner.nextInt();
        if (age>=18) {
            System.out.println("You're eligible");
        }
            else {
            System.out.println("You're not eligible");
        }



    }
}