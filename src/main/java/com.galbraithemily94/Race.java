package com.galbraithemily94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Race {

    //Constants and list needed to generate race
    protected static final String DRAGONBORN = "Dragonborn";
    protected static final String DWARF = "Dwarf";
    protected static final String ELF = "Elf";
    protected static final String GNOME = "Gnome";
    protected static final String HALF_ELF = "Half-Elf";
    protected static final String HALFLING = "Halfling";
    protected static final String HALF_ORC = "Half-Orc";
    protected static final String HUMAN = "Human";
    protected static final String TIEFLING = "Tiefling";
    protected static final List<String> raceList = new ArrayList<String>(Arrays.asList(DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALFLING, HALF_ORC, HUMAN, TIEFLING));

    public List<String> getRaceList() {
        return raceList;
    }

    //Method to return a random race to set Character race with
    public String getRandomCharacterRace() {
        Collections.shuffle(raceList);
        String characterRace = raceList.remove(0);
        return characterRace;
    }

    //Will print out race options to user
    public void raceListToString() {
        for (String race : raceList) {
            System.out.print(race + " ");
        }
        System.out.println("");
    }
}
