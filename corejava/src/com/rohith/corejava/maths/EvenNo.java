package com.rohith.corejava.maths;

import java.util.Scanner;

public class EvenNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Even number to print least even numbers: ");
        for( int i=sc.nextInt(); i>=0; i-=2){
            System.out.println(i);
        }

        System.out.println("Even Numbers");

    }
}
