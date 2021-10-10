package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dragonborn extends Race {
    List<String> draconicAncestryList = new ArrayList<>(Arrays.asList("Black", "Blue", "Brass", "Bronze", "Copper", "Gold", "Green", "Red", "Silver", "White"));
    List<Integer> young = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30));
    List<Integer> middleAge = new ArrayList<>(Arrays.asList(31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50));
    List<Integer> old = new ArrayList<>(Arrays.asList(51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80));

    //Below are things for character sheet creation.
    private String size = "medium";
    private int height; //Standing well over 6 feet tall
    private int weight; //Averaging at almost 250lbs
    private String alignment; //Tend towards good or evil in extremes
    private int speed = 30;
    private int strengthMod = 2;
    private int charismaMod = 1;

    //getters
    public int getSpeed() { return speed; }
    public int getStrengthMod() { return strengthMod; }
    public int getCharismaMod() { return charismaMod; }

    //Methods
    @Override
    public void getRandomName(Character character) {
        //Clan name first(long and complex), personal name simple 1/2 syllables, soft tones, female begin of alpha, males middle
        List<String> clanNames = new ArrayList<>(Arrays.asList("Fentinxis", "Sherixijiir", "Ophinmituth", "Noasredilin", "Fennudanliath", "Kerxakaathurgiesh", "Ophinxikabran", "Nemnuthiaus", "Prexakanidilin", "Cleththisthiajiir"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Akra", "Dava", "Kordeh", "Kaar", "Nara", "Biri", "Havila", "Soina", "Fariva", "Rairi"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Medgar", "Tarv", "Patkan", "Rhov", "Krigar", "Ghekan", "Tarmash", "Pandsh", "Namash", "Rhorin"));
        List<String> nickname = new ArrayList<>(Arrays.asList("The Tablebiter", "The Fainter", "The Wallwrecker", "The Graceful", "The Wanderer", "The Growler", "The Spirited", "The Murmurer", "The Dreamer"));
        List<String> nonBinaryNames = new ArrayList<>();
        nonBinaryNames.addAll(femaleNames);
        nonBinaryNames.addAll(maleNames);
        Collections.shuffle(clanNames);
        Collections.shuffle(femaleNames);
        Collections.shuffle(maleNames);
        Collections.shuffle(nickname);
        Collections.shuffle(nonBinaryNames);
        String name;
        if(character.getGender().equals("Females")){
            name = String.format("%s %s %s", clanNames.remove(0), femaleNames.remove(0),nickname.remove(0));
        } else if(character.getGender().equals("Male")){
            name = String.format("%s %s %s", clanNames.remove(0), maleNames.remove(0),nickname.remove(0));
        } else {
            name = String.format("%s %s %s", clanNames.remove(0), nonBinaryNames.remove(0),nickname.remove(0));
        }
        character.setName(name);
    }

    @Override
    public void ageInformation(){
        System.out.print("Dragon age quickly and could be adventuring as young as 6 years old. They live to be around 80 years old, please enter your character's age: ");
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        Collections.shuffle(young);
        Collections.shuffle(middleAge);
        Collections.shuffle(old);
        if(ageRange.equals("Young")){
            age = young.remove(0);
        } else if(ageRange.equals("Middle-Aged")) {
            age = middleAge.remove(0);
        } else {
            age = old.remove(0);
        }
        character.setAge(age);
    }

    //Method for if they do not want to pick an age range
    @Override
    public void getRandomAge(Character character) {
        int age = 0;
        List<Integer> allAges = new ArrayList<>();
        allAges.addAll(young);
        allAges.addAll(middleAge);
        allAges.addAll(old);
        Collections.shuffle(allAges);
        age = allAges.remove(0);
        character.setAge(age);
    }

    public String[] getSubType() {
        String[] subTypeArray = draconicAncestryList.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(draconicAncestryList);
        String draconicAncestry = draconicAncestryList.remove(0);
        character.setRaceSubType(draconicAncestry);
    }

    @Override
    public String toString(){
        return "Dragonborn";
    }
}
