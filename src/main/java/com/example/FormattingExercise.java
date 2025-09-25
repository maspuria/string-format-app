package com.example;

public class FormattingExercise {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.6789;
        // Step 1
        String formatName = String.format("Name: %s", name);
        System.out.println(formatName);
        // Step 2: format and print the int variable age
        String formatAge = String.format("Age: %d", age);
        System.out.println(formatAge);
        //step 3: format and print the double variable gpa with 2 decimal places
        String formatGpa = String.format("GPA: %.2f", gpa);
        System.out.println(formatGpa);
        // step 4 combine all three into one formatted sentence using String.format
        String formatSentence = String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
        System.out.println(formatSentence);
        // step 5 print the same thing using printf
        System.out.printf("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
    }
}
