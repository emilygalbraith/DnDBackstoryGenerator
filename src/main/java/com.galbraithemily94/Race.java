package com.galbraithemily94;

import com.galbraithemily94.Races.*;

import java.util.*;

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
    public void getRandomCharacterRace(Character character, String raceChoice) {
        String characterRace;
        if(raceChoice.equals("")) {
            Collections.shuffle(raceList);
            characterRace = raceList.remove(0);
        } else {
            characterRace = raceChoice;
        }
        if(characterRace.equals(DRAGONBORN)){
            Dragonborn dragonborn = new Dragonborn();
            character.setRace(dragonborn);
        } else if (characterRace.equals(DWARF)){
            Dwarf dwarf = new Dwarf();
            character.setRace(dwarf);
        } else if (characterRace.equals(ELF)){
            Elf elf = new Elf();
            character.setRace(elf);
        } else if (characterRace.equals(GNOME)){
            Gnome gnome = new Gnome();
            character.setRace(gnome);
        } else if (characterRace.equals(HALF_ELF)){
            HalfElf halfElf = new HalfElf();
            character.setRace(halfElf);
        } else if (characterRace.equals(HALFLING)){
            Halfling halfling = new Halfling();
            character.setRace(halfling);
        } else if (characterRace.equals(HALF_ORC)){
            HalfOrc halfOrc = new HalfOrc();
            character.setRace(halfOrc);
        } else if (characterRace.equals(HUMAN)){
            Human human = new Human();
            character.setRace(human);
        } else if (characterRace.equals(TIEFLING)){
            Tiefling tiefling = new Tiefling();
            character.setRace(tiefling);
        }
    }

    public void setRace(Character character, String raceChoice) {
        getRandomCharacterRace(character, raceChoice);
    }

    //Will print out race options to user
    public void raceListToString() {
        for (String race : raceList) {
            System.out.print(race + " ");
        }
        System.out.print("");
    }

    //Methods that subclasses override
    public void getRandomName(Character character) {}
    public void ageInformation(){}
    public void getRandomAge(Character character, String ageRange) {}
    public void getRandomAge(Character character) {}
}
