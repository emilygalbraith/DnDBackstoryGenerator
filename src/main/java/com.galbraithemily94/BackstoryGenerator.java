package com.galbraithemily94;

import java.util.Scanner;

public class BackstoryGenerator {
    public static void main(String[] args) {
        //Creation of the character through user input
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Would you like to generate a new character backstory? (Y) (N) ");
        String userAnswer = input.nextLine();
        if(userAnswer.equals("Y")) {
            System.out.println("Would you like this to be completely random? (Y) (N) ");
            String randomAnswer = input.nextLine();
            Character newCharacter = new Character();
            if(randomAnswer.equals("Y")) {
                System.out.println("You character is a: " + newCharacter.getCharacterRace());
            } else {
                System.out.println("Please pick from one of the following races: ");
                Race race = new Race();
                race.raceListToString();
                String raceChoice = input.nextLine();
                newCharacter.setCharacterRace(raceChoice);
            }
        }

        //Creation of the backstory and output of the backstory


    }
}
