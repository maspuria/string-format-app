package com.example;

public class FormatPractice {
    public static void main(String[] args) {
        String iconsName = "Lady Gaga";
        String fanBaseName = "Little Monsters";
        int numberOfGrammys = 14;
        double iconicMeatDressWeight =  22.68;

        // Step 1A : Format and print the string variable (iconsName)
        String artistOfTheYear = String.format("The Artist of the Year for 2025: %s", iconsName);
        System.out.println(artistOfTheYear);
        // Step 1B: Format and print the string variable (fanBaseName)
        String fanNameOrigin = String.format("Lady Gaga's fan base name '%s' originated in 2009 during the Monster Ball Tour.", fanBaseName);
        System.out.println(fanNameOrigin);
        // Step 2: Format and print for the int variable (numberOfGrammys)
        String grammyWins = String.format("Lady Gaga has won %d Grammy Awards.", numberOfGrammys);
        System.out.println(grammyWins);
        // Step 3: Format and print the double variable (iconicMeatDressWeight) with 2 decimal places
        String mtvVma = String.format("At the 2010's MTV VMA's, she wore a raw meat dress that weighed %.2f kg (50lbs).", iconicMeatDressWeight);
        System.out.println(mtvVma);




    }
}
