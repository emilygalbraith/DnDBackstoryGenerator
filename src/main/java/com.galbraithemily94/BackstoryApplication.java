package com.galbraithemily94;

import java.util.Locale;
import java.util.Scanner;

public class BackstoryApplication {
    public static void main(String[] args) {
        //Creation of the character through user input
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Would you like to generate a new character backstory? (Y) (N) ");
        String userAnswer = input.nextLine().toUpperCase().substring(0,1);
        if(userAnswer.equals("Y")) {
            System.out.println("Would you like to pick a race? (Y) (N) ");
            String randomAnswer = input.nextLine().toUpperCase().substring(0,1);
            Character newCharacter = new Character();
            BackstoryGenerator newBackStory = new BackstoryGenerator();
            if(randomAnswer.equals("N")) {
                newCharacter.setRace(newBackStory.getRandomCharacterRace());
                System.out.println("You character is a: " + newCharacter.getRace());
            } else {
                System.out.println("Please pick from one of the following races: ");
                newBackStory.raceListToString();
                String raceChoice = input.nextLine();
                newCharacter.setRace(raceChoice);
            }
        }

        //Creation of the backstory and output of the backstory


    }
}
