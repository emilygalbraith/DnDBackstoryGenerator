package com.galbraithemily94.Races;

import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HalfOrc extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private List<String> halfOrcTypes = new ArrayList<>(Arrays.asList("Mark of Gruumsh", "Mark of Finding"));


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Orc"));
    private int strengthMod = 2;
    private String alignment;
    private String size = "Medium";
    private int height; //between 5 and 6ft tall
    private int weight; //average 200lbs
    private int speed = 30;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Wolfmaw", "Caltred", "Ironhelm", "Unforgiving", "Hellgrip", "Moonaxe", "Sosomul", "Khehlir", "Allokar", "Zeme"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Kotashi", "Ketonchu", "Sumane", "Rawigu", "Senugar", "Rahoni", "Zunuri", "Fulazura", "Zenutah", "Gynozara"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Thuridash", "Garesk", "Atrug", "Zasemur", "Brakonur", "Mogagak", "Bod", "Zavurim", "Guludim", "Ullud"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Half-Orc";
    }


    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = halfOrcTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(halfOrcTypes);
        String subType = halfOrcTypes.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 25) + 12;
        middleAged = (int) (Math.random() * 50) + 26;
        old = (int) (Math.random() * 75) + 51;
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
        allAges = (int) (Math.random() * 75) + 12;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String halfOrc1 = "\nHalf-Orcs are unwelcome almost everywhere, and thus are known to thrive in challenging environments.";
        String halfOrc2 = "\nHalf-Orcs are known to be free-spirited, brash, and typically underestimated due to their ability to be cunning.";
        earlyLives.add("an orc tribe as the child of their leader" + halfOrc1 + "\n" + character.getSubjectPronoun().toLowerCase() + " often ended up the target of bullying by Orcs, viewed as weaker and inferior to them");
        earlyLives.add("in a band of Half-Orc mercenaries." + halfOrc2 + "\nThey traveled where ever money led them, and " + character.getSubjectPronoun().toLowerCase() + " dreamed of the day " + character.getSubjectPronoun().toLowerCase() + " could join as a warrior");
        earlyLives.add("on the outskirts of a human village, the child of a blacksmith." + halfOrc1 + "\nAlthough some had accepted their family after all these years, it was lonely");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
