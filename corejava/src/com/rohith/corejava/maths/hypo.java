package com.rohith.corejava.maths;

import java.util.Scanner;

public class hypo {
    public static void main(String[] args) {


        double x;
        double y;
        double z;

        System.out.println("Entre side x : ");

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextDouble();
        System.out.println("Entre side y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypotenuse of z is " + z);
        scanner.close();
    }
}