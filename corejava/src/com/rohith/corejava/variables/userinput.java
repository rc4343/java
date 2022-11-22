package com.rohith.corejava.variables;

import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = sc.nextLine();
        System.out.println("how are you doing today? " +name);
        String input = sc.nextLine();
        System.out.println(input);
    }


}
