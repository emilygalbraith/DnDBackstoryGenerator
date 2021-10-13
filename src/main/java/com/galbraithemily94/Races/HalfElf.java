package com.galbraithemily94.Races;

import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HalfElf extends Race {

    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private List<String> halfElfTypes = new ArrayList<>(Arrays.asList("Aquatic", "Drow", "High", "Mark of Detection", "Mark of Storm", "Wood"));


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Elven")); //plus one of choice
    private int charismaMod = 2; //Two other abilities of choice increase by 1
    private String alignment; //Most half elves tend to be chaotic.
    private String size = "Medium";
    private int height; //between 5 and 6ft tall
    private int weight; //average 150lbs
    private int speed = 30;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Petwenys", "Helelana", "Lusandoral", "Reysatra", "Caisandoral", "Olozorwyn", "Engella", "Ralomyar", "Waeslana", "Zinsalor"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Krihana", "Maresys", "Olphira", "Kysnoa", "Alynalore", "Fhaxipha", "Safrila", "Zelstine", "Vylnoa", "Magalyn"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Corovar", "Marben", "Jamfinas", "Zansariph", "Leocoril", "Crakas", "Fallamir", "Vicfyr", "Waltumil", "Belfinas"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Half-Elf";
    }


    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = halfElfTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(halfElfTypes);
        String subType = halfElfTypes.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 50) + 16;
        middleAged = (int) (Math.random() * 130) + 51;
        old = (int) (Math.random() * 180) + 131;
        if(ageRange.equals("Young")){
            age = young;
        } else if(ageRange.equals("Middle-Aged")) {
            age = middleAged;
        } else {
            age = old;
        }
        character.setAge(age);
    }

    //Method for if they do not want to pick an age range
    @Override
    public void getRandomAge(Character character) {
        int age = 0;
        allAges = (int) (Math.random() * 180) + 16;
        age = allAges;
        character.setAge(age);
    }
}
