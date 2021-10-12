package com.galbraithemily94.Races;

import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

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
    private List<String> halflingTypes = new ArrayList<>(Arrays.asList("Lightfoot", "Stout", "Ghostwise", "Lotusden", "Mark of Hospitality", "Mark of Healing"));


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
        String[] subTypeArray = halflingTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(halflingTypes);
        String subType = halflingTypes.remove(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 30) + 16;
        middleAged = (int) (Math.random() * 100) + 31;
        old = (int) (Math.random() * 150) + 101;
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
        allAges = (int) (Math.random() * 150) + 16;
        age = allAges;
        character.setAge(age);
    }
}
