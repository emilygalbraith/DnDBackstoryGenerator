package com.galbraithemily94.race;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Halfling extends Race {

    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private String[] halflingTypes = {"Lightfoot", "Stout"};


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Halfling")); //plus one of choice
    private int dexterityMod = 2; //Two other abilities of choice increase by 1
    private String alignment; //Most halflings tend to be lawful good.
    private String size = "Small";
    private int height; //average 3ft tall
    private int weight; //average 40lbs
    private int speed = 25;
    private int darkvision = 0;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Mossmoon", "Reedseeker", "Bramblehare", "Elderfound", "Havensky", "Silverhands", "Ferntop", "Thornbelly", "Cinderhollow", "Wildace"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Odiri", "Nedla", "Faymita", "Ritina", "Vafice", "Zefrana", "Hilalyn", "Belzira", "Isayra", "Kithola"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Linry", "Godak", "Urifer", "Jopos", "Teemin", "Quoamin", "Ricster", "Flynzor", "Yendon", "Tarsire"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Halfling";
    }


    @Override
    public String[] getSubTypeArray() {
        return halflingTypes;
    }

    @Override
    public void getRandomSubType(Character character) {
        List<String> halflingTypeList = new ArrayList<>(Arrays.asList(halflingTypes));
        Collections.shuffle(halflingTypeList);
        String subType = halflingTypeList.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 15) + 16;
        middleAged = (int) (Math.random() * 70) + 31;
        old = (int) (Math.random() * 50) + 101;
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
        allAges = (int) (Math.random() * 135) + 16;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String halfling1 = " Halflings value family, community, and the simple pleasures of life beyond all else.";
        String halfling2 = " Halfings love stories and legends and tend to have a strong oral tradition.";
        String halfling3 = " Haflings love discovering new things, even simple things like new exotic food or unfamiliar clothing.";
        earlyLives.add("in an idyllic village of halflings." + halfling1 + " As " + character.getPossessivePronoun().toLowerCase() + " family ran the tavern, life was filled with what mattered. Good food, company, and songs");
        earlyLives.add("looking forward to the evening when Euphemia would sing songs and stories at the tavern." + halfling2 + " The best one was of a halfling named Bilbo who helped a band of dwarves outsmart and defeat a dragon named Smog");
        earlyLives.add("in a traveling community of halflings." + halfling3 + " Life never got boring, seeing so many new places meant always having new curiosities to explore");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
