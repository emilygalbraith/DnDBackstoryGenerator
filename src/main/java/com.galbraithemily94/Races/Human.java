package com.galbraithemily94.Races;

import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Human extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private String[] humanTypes = {""};


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common"));
    private String alignment; //No particular alignment.
    private String size = "Medium";
    private int height; //between 5 and 6ft tall
    private int weight;
    private int speed = 30;
    private int darkvision = 0;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Mastei", "Dacral", "Tarrish", "Zaom", "Vires", "Milnifas", "Sobrose", "Fardust", "Stoutfire", "Surill"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Lurah", "Sirru", "Ashanti", "Valerien", "Brynn", "Fayette", "Seraphine", "Josie", "Noemi", "Savanah"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Jaylan", "Finn", "Alwyn", "Jevon", "Blaize", "Ingram", "Emlyn", "Witas", "Rory", "Axel"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Human";
    }


    @Override
    public String[] getSubTypeArray() {
        return humanTypes;
    }

    @Override
    public void getRandomSubType(Character character) {
        List<String> humanTypeList = new ArrayList<>(Arrays.asList(humanTypes));
        Collections.shuffle(humanTypeList);
        String subType = humanTypeList.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 15) + 16;
        middleAged = (int) (Math.random() * 20) + 31;
        old = (int) (Math.random() * 30) + 51;
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
        allAges = (int) (Math.random() * 65) + 16;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null){
            character.setRandomGender();
        }
//        String human1 = "\n";
//        String human2 = "\n";
        earlyLives.add("in a quiet pastoral village helping on the family farm." + " It was happy, yet left plenty of time to dream of different places");
        earlyLives.add("in a vibrant city full of stories and their heroes." + " However, as a child of one of those heroes' servants it always seemed like someone else's fairytale");
//        earlyLives.add("" + "\n");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
