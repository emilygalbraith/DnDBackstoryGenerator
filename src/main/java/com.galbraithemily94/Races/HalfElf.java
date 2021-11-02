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
    private List<String> halfElfTypes = new ArrayList<>(Arrays.asList("Dark Elf", "High", "Wood"));


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

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String halfElf1 = " Half elves live between two worlds. Welcome by humans, but outliving them. Less welcomed by elves, and often feeling restless in their timeless societies.";
        String halfElf2 = " Half elves tend to be driven by wanderlust because of their long lives and lack of a true home or people.";
        String halfElf3 = " Half elves inherit their ambition, curiosity, and inventiveness from humans and love of nature and whimsy from elves.";
        earlyLives.add("amongst humans in a bustling city. Often seeking out quiet dilapidated areas where wild plants fought to take root." + halfElf3 + " While happy amongst humans, sometimes the lack of nature felt suffocating");
        earlyLives.add("amongst elves always feeling a bit out of step with " + character.getPossessivePronoun().toLowerCase() + " peers." + halfElf1 + " Sneaking off to a nearby city was life altering, feeling the energy of human life. Like a fast burning candle");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
