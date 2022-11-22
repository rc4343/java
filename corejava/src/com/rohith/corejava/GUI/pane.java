package com.rohith.corejava.GUI;

import javax.swing.*;

public class pane {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"your age "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height in cm"));
        JOptionPane.showMessageDialog(null,"you're "+height+" cm tall.");

    }
}
