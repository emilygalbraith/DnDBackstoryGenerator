package com.galbraithemily94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Character {
    private String characterRace;
    private Class characterClass;
    private Location characterLocation;
    private Background characterBackground;

    //Constants and list needed to generate race
    private static String DRAGONBORN = "Dragonborn";
    private static String DWARF = "Dwarf";
    private static String ELF = "Elf";
    private static String GNOME = "Gnome";
    private static String HALF_ELF = "Half-Elf";
    private static String HALFLING = "Halfling";
    private static String HALF_ORC = "Half-Orc";
    private static String HUMAN = "Human";
    private static String TIEFLING = "Tiefling";
    private List<String> raceList = new ArrayList<String>(Arrays.asList(DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALFLING, HALF_ORC, HUMAN, TIEFLING));

    public Character() {
        characterRace = getRandomCharacterRace();
    }

    public String getCharacterRace() { return characterRace; }


    public String getRandomCharacterRace() {
        Collections.shuffle(raceList);
        characterRace = raceList.remove(0);
        return characterRace;
    }

}
