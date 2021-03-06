package com.galbraithemily94.race;

import com.galbraithemily94.Character;
import com.galbraithemily94.race.*;

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
    protected static final String[] RACE_ARRAY = {DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALFLING, HALF_ORC, HUMAN, TIEFLING};
    protected static final List<String> RACE_LIST = new ArrayList<>(Arrays.asList(RACE_ARRAY));

    public List<String> getRaceList() {return RACE_LIST;}
    public String[] getRaceArray() {return RACE_ARRAY;}

    public String getRandomName(Character character, List<String> femaleNames, List<String> maleNames, List<String> clanNames) {
        String name;
        List<String> nonBinaryNames = new ArrayList<>();
        nonBinaryNames.addAll(femaleNames);
        nonBinaryNames.addAll(maleNames);
        Collections.shuffle(clanNames);
        Collections.shuffle(femaleNames);
        Collections.shuffle(maleNames);
        Collections.shuffle(nonBinaryNames);
        if(character.getGender().equals("Female")){
            name = String.format("%s %s", femaleNames.remove(0), clanNames.remove(0));
        } else if(character.getGender().equals("Male")){
            name = String.format("%s %s", maleNames.remove(0), clanNames.remove(0));
        } else {
            name = String.format("%s %s", nonBinaryNames.remove(0), clanNames.remove(0));
        }
        return name;
    }

    public String getRandomName(Character character, List<String> femaleNames, List<String> maleNames) {
        List<String> emptyList = new ArrayList<>(Arrays.asList(""));
        String name = getRandomName(character, femaleNames, maleNames, emptyList);
        return name;
    }


    public void getRandomCharacterRace(Character character, String raceChoice) {
        String characterRace;
        if(raceChoice.equals("")) {
            Collections.shuffle(RACE_LIST);
            characterRace = RACE_LIST.get(0);
        } else {
            characterRace = raceChoice;
        }
        switch (characterRace) {
            case DRAGONBORN :
                Dragonborn dragonborn = new Dragonborn();
                character.setRace(dragonborn);
                break;
            case DWARF:
                Dwarf dwarf = new Dwarf();
                character.setRace(dwarf);
                break;
            case ELF:
                Elf elf = new Elf();
                character.setRace(elf);
                break;
            case GNOME:
                Gnome gnome = new Gnome();
                character.setRace(gnome);
                break;
            case HALF_ELF:
                HalfElf halfElf = new HalfElf();
                character.setRace(halfElf);
                break;
            case HALFLING:
                Halfling halfling = new Halfling();
                character.setRace(halfling);
                break;
            case HALF_ORC:
                HalfOrc halfOrc = new HalfOrc();
                character.setRace(halfOrc);
                break;
            case HUMAN:
                Human human = new Human();
                character.setRace(human);
                break;
            case TIEFLING:
                Tiefling tiefling = new Tiefling();
                character.setRace(tiefling);
                break;
        }
    }

    public void setRace(Character character, String raceChoice) {
        getRandomCharacterRace(character, raceChoice);
    }


    //Methods that subclasses override
    public void getRandomName(Character character) {}
    public void getRandomAge(Character character, String ageRange) {}
    public void getRandomAge(Character character) {}
    public void getRandomSubType(Character character) {}
    public String[] getSubTypeArray() {
        String[] subTypeArray = new String[0];
        return subTypeArray;
    }
    public String getEarlyLife(Character character) { return ""; }
}
