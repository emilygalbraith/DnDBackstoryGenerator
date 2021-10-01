package com.galbraithemily94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Race {
    private String characterRace;

    //Constants and list needed to generate race
    private static final String DRAGONBORN = "Dragonborn";
    private static final String DWARF = "Dwarf";
    private static final String ELF = "Elf";
    private static final String GNOME = "Gnome";
    private static final String HALF_ELF = "Half-Elf";
    private static final String HALFLING = "Halfling";
    private static final String HALF_ORC = "Half-Orc";
    private static final String HUMAN = "Human";
    private static final String TIEFLING = "Tiefling";
    private static final List<String> raceList = new ArrayList<String>(Arrays.asList(DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALFLING, HALF_ORC, HUMAN, TIEFLING));


    //Allows Character class to set a random race
    public String getRandomCharacterRace() {
        Collections.shuffle(raceList);
        characterRace = raceList.remove(0);
        return characterRace;
    }

    //Will print out race options to user
    public void raceListToString() {
        System.out.print("Choose from the following: ");
        for (String race : raceList) {
            System.out.print(race + " ");
        }
        System.out.println("");
    }
}
