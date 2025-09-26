package com.example;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Step 1
        System.out.println("What is your name? ");
        String name = myScanner.nextLine();
        // Step 2
        System.out.println("How old are you? ");
        int age = myScanner.nextInt();
        // Step 3
        System.out.println("How tall are you in meters? ");
        double height = myScanner.nextDouble();
        // Step 4
        System.out.println("Do you like Java? True or False ");
        boolean likeJava = myScanner.nextBoolean();

        System.out.println("Hi there, " + name + "!");
        System.out.println("Your age is: " + age + " years old");
        System.out.println("Your height is: " + height + " meters");
        System.out.println("Do you like Java: " + likeJava);
    }
}
