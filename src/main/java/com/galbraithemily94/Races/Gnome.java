package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gnome extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private List<String> gnomeTypes = new ArrayList<>(Arrays.asList("Forest", "Rock", "Deep"));


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Gnomish"));
    private int intelligenceMod = 2;
    private String alignment; //Most gnomes tend to be good and either lawful/chaotic.
    private String size = "Small";
    private int height; //between 3 and 4ft tall
    private int weight; //average 40lbs
    private int speed = 25;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Falririmp", "Melwuran", "Zaglewogle", "Wempledimple", "Thistletwist", "Quillpitch", "Wopplelapple", "Mulkenerind", "Senpubosen", "Rimbotena"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Xafi", "Sakasys", "Voroe", "Quehani", "Triwyse", "Daphissa", "Daphiyore", "Breezyre", "Tifadira", "Arirhana"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Xomorn", "Erdri", "Wilrug", "Zanpip", "Xoston", "Rasxim", "Yospos", "Urilen", "Quafan", "Lofiz"));
        List<String> nickNames = new ArrayList<>(Arrays.asList("Aleslosh", "Ashhearth", "Badger", "Cloak", "Doublelock", "Filchbatter", "Fnipper", "Ku", "Oneshoe", "Pock", "Sparklegem", "Stumbleduck"));
        Collections.shuffle(nickNames);
        String name = nickNames.remove(0) + " " + super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Gnome";
    }


    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = gnomeTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(gnomeTypes);
        String subType = gnomeTypes.remove(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 40) + 16;
        middleAged = (int) (Math.random() * 200) + 41;
        old = (int) (Math.random() * 500) + 201;
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
        allAges = (int) (Math.random() * 500) + 16;
        age = allAges;
        character.setAge(age);
    }
}
