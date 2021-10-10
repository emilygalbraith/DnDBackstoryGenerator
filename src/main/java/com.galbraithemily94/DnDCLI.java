package com.galbraithemily94;

import com.galbraithemily94.View.Menu;
import com.galbraithemily94.Races.Dragonborn;

import java.util.Scanner;

public class DnDCLI {
    //create enums for menus
    private static final String MAIN_MENU_OPTION_CREATE_NEW_CHARACTER = "Create a new character backstory";
    private static final String MAIN_MENU_OPTION_GENERATE_SHEET = "Generate a character sheet for your current character";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_CREATE_NEW_CHARACTER, MAIN_MENU_OPTION_GENERATE_SHEET, MAIN_MENU_OPTION_EXIT };
    private static final String BACKSTORY_GENERATOR_MENU_RANDOM_BACKSTORY = "Completely random backstory";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_NAME = "Choose a name";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_AGE = "Choose an age";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_GENDER = "Choose a gender";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_RACE = "Choose a race";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_CLASS = "Choose a class";
    private static final String BACKSTORY_GENERATOR_MENU_CHOOSE_BACKGROUND = "Choose a background";
    private static final String BACKSTORY_GENERATOR_MENU_CREATE_BACKSTORY = "Create Backstory";
    private static final String[] BACKSTORY_GENERATOR_MENU = { BACKSTORY_GENERATOR_MENU_RANDOM_BACKSTORY, BACKSTORY_GENERATOR_MENU_CHOOSE_NAME, BACKSTORY_GENERATOR_MENU_CHOOSE_AGE, BACKSTORY_GENERATOR_MENU_CHOOSE_GENDER, BACKSTORY_GENERATOR_MENU_CHOOSE_RACE, BACKSTORY_GENERATOR_MENU_CHOOSE_CLASS, BACKSTORY_GENERATOR_MENU_CHOOSE_BACKGROUND, BACKSTORY_GENERATOR_MENU_CREATE_BACKSTORY };
    private static final String RACE_MENU_CHOOSE_SUBTYPE = "Choose a race subtype";
    private static final String RACE_MENU_RETURN_TO_GENERATOR_MENU = "Return to generator menu";
    private static final String[] RACE_MENU_OPTIONS = {RACE_MENU_CHOOSE_SUBTYPE, RACE_MENU_RETURN_TO_GENERATOR_MENU};

    //Instance variables
    private Menu menu;

    //constructor for DnDCLI
    public DnDCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        //While loop that will keep CLI going until the user is done.
        while(true) {
            //Creation of the character through user input
            Character newCharacter = new Character();
            Scanner input = new Scanner(System.in);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Would you like to generate a new character backstory? (Y) (N) ");
            //Edits users input to match what I check against. //TODO add try/catch for any unforeseen input??
            String userAnswer = input.nextLine().toUpperCase().substring(0, 1);
            if (userAnswer.equals("Y")) {
                //Create new Character object and BackstoryGenerator
                Race generateNewRace = new Race();

                //Set race and subrace for character using Race Class and its subclasses
                System.out.print("Would you like to pick a race? (Y) (N) ");
                String randomRace = input.nextLine().toUpperCase().substring(0, 1);
                if (randomRace.equals("N")) {
                    generateNewRace.getRandomCharacterRace(newCharacter, "");
                    System.out.println("Your character is a: " + newCharacter.getRace());
                    if (newCharacter.getRaceToString().equals("Dragonborn")) {
                        Dragonborn dragonborn = new Dragonborn();
                        System.out.print("Would you like to select a Draconic ancestry? (Y) (N) ");
                        String draconicAncestry = input.nextLine().toUpperCase().substring(0, 1);
                        if (draconicAncestry.equals("N")) {
                            newCharacter.setRaceSubType(dragonborn.getRandomDraconicAncestry());
                            System.out.println("Your character is a " + newCharacter.getRaceSubType() + " Dragonborn");
                        } else {
                            System.out.print("Please pick from the following Draconic Ancestries: ");
                            dragonborn.draconicAncestryListToString();
                            String draconicChoice = input.nextLine();
                            newCharacter.setRaceSubType(draconicChoice);
                        }
                    }
                } else {
                    System.out.print("Please pick from one of the following races: ");
                    generateNewRace.raceListToString();
                    String raceChoice = input.nextLine();
                    generateNewRace.setRace(newCharacter, raceChoice);
                    System.out.println("Your character is a: " + newCharacter.getRace().toString());
                    if (newCharacter.getRaceToString().equals("Dragonborn")) {
                        Dragonborn dragonborn = new Dragonborn();
                        System.out.print("Would you like to select a Draconic ancestry? (Y) (N) ");
                        String draconicAncestry = input.nextLine().toUpperCase().substring(0, 1);
                        if (draconicAncestry.equals("N")) {
                            newCharacter.setRaceSubType(dragonborn.getRandomDraconicAncestry());
                            System.out.println("Your character is a " + newCharacter.getRaceSubType() + " Dragonborn");
                        } else {
                            System.out.print("Please pick from the following Draconic Ancestries: ");
                            dragonborn.draconicAncestryListToString();
                            String draconicChoice = input.nextLine();
                            newCharacter.setRaceSubType(draconicChoice);
                        }
                    }
                }
                //Set gender
                System.out.print("Would you like to pick a gender? (Y) (N) ");
                String genderAnswer = input.nextLine().toUpperCase().substring(0, 1);
                if (genderAnswer.equals("Y")) {
                    System.out.print("Please enter what gender you would like your character to be: (Male) (Female) (Non-binary) ");
                    String gender = input.nextLine();
                    newCharacter.setGender(gender);
                } else {
                    newCharacter.setRandomGender();
                    System.out.println("Your character is: " + newCharacter.getGender());
                }

                //Set name based on race using race subclasses
                System.out.print("Would you like to pick an name? (Y) (N) ");
                String randomName = input.nextLine().toUpperCase().substring(0, 1);
                if (randomName.equals("Y")) {
                    System.out.print("Please enter your character's name: ");
                    String nameAnswer = input.nextLine();
                    newCharacter.setName(nameAnswer);
                } else {
                    newCharacter.getRace().getRandomName(newCharacter);
                    System.out.println("Your character's name is: " + newCharacter.getName());
                }

                //Set an age based on race using race subclasses
                System.out.print("Would you like to pick an age? (Y) (N) ");
                String randomAge = input.nextLine().toUpperCase().substring(0, 1);
                if (randomAge.equals("Y")) {
                    newCharacter.getRace().ageInformation();
                    System.out.print("How old would you like your character to be? ");
                } else {
                    System.out.print("Would you like to pick an age range? (Y) (N) ");
                    String ageRangeAnswer = input.nextLine().toUpperCase().substring(0, 1);
                    if (ageRangeAnswer.equals("Y")) {
                        System.out.print("Would you like your character to be (Young) (Middle-Aged) (Old) ");
                        String ageRange = input.nextLine();
                        newCharacter.getRace().getRandomAge(newCharacter, ageRange);
                        System.out.println("Your character is: " + newCharacter.getAge());
                    } else {
                        newCharacter.getRace().getRandomAge(newCharacter);
                        System.out.println("Your character is: " + newCharacter.getAge());
                    }
                }
            }
        }
    }

    //main method goes her, it initializes menu, sending it an input/output, creates a new DnDCLI, then calls the run method
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        DnDCLI cli = new DnDCLI(menu);
        cli.run();
    }

}
