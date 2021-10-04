package com.galbraithemily94;

import java.util.Scanner;

public class BackstoryApplication {
    public static void main(String[] args) {
        //Creation of the character through user input
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Would you like to generate a new character backstory? (Y) (N) ");
        //Edits users input to match what I check against. //TODO add try/catch for any unforeseen input
        String userAnswer = input.nextLine().toUpperCase().substring(0,1);
        if(userAnswer.equals("Y")) {
            //Create new Character object and BackstoryGenerator
            Character newCharacter = new Character();
            Race generateNewRace = new Race();

            //Set race for character using BackstoryGenerator
            System.out.println("Would you like to pick a race? (Y) (N) ");
            String randomRace = input.nextLine().toUpperCase().substring(0,1);
            if(randomRace.equals("N")) {
                generateNewRace.getRandomCharacterRace(newCharacter, "");
                System.out.println("You character is a: " + newCharacter.getRace());
            } else {
                System.out.println("Please pick from one of the following races: ");
                generateNewRace.raceListToString();
                String raceChoice = input.nextLine();
                generateNewRace.setRace(newCharacter, raceChoice);
                System.out.println("You're character is a: " + newCharacter.getRace().toString());
            }

            //Set age based on race using AgeGenerator
            System.out.println("Would you like to pick an age? (Y) (N) ");
            String randomAge = input.nextLine().toUpperCase().substring(0,1);
            if(randomAge.equals("Y")){

            }
        }

        //Creation of the backstory and output of the backstory


    }
}
