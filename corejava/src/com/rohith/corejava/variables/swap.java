package com.rohith.corejava.variables;

public class swap {

    public static void main(String[] args) {

        String x = "car";
        String y = "bike";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x =" +x);
        System.out.println("y =" +y);
    }
}
