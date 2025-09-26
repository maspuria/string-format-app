package com.example;

public class FormatPractice {
    public static void main(String[] args) {
        String iconsName = "Lady Gaga";
        int numberOfGrammys = 14;
        double iconicMeatDressWeight =  22.68;

        // Step 1 : Format and print the string variable (icons name)
        String artistOfTheYear = String.format("The Artist of the Year for 2025: %s", iconsName);
        System.out.println(artistOfTheYear);



    }
}
