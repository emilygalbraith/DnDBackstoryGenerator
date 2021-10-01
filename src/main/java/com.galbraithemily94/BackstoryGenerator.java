package com.galbraithemily94;

import java.util.Scanner;

public class BackstoryGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Would you like to generate a new character backstory? (Y) (N) ");
        String userAnswer = input.nextLine();
        if(userAnswer.equals("Y")) {
            System.out.println("Would you like this to be completely random? (Y) (N) ");
            String randomAnswer = input.nextLine();
            if(randomAnswer.equals("Y")) {
                Character newCharacter = new Character();
                System.out.println(newCharacter.getCharacterRace());
            }
        }


    }
}
