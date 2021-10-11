package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Elf extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private List<String> elfTypes = new ArrayList<>(Arrays.asList("Dark Elf", "Eladrin", "High", "Sea", "Shadar-Kai", "Wood", "Pallid", "Mark of Shadow", "Avariel", "Grugach", "Bishtahar", "Tirahar", "Vahadar", "Zendikar", "Astral"));


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Elven"));
    private int dexterityMod = 2;
    private String alignment; //Most elves lean towards gentle chaos, more often good
    private String size = "Medium";
    private int height; //between 5 and 6ft tall
    private int weight; //average 120lbs
    private int speed = 30;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Windwatcher", "Willowflow", "Ashpetal", "Duskcrown", "Nightpride", "Yaloste", "Feythodrann", "Xelphephano", "Oakenbrook", "Duvophan"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Lorarieth", "Yesra", "Ennala", "Qiphine", "Zylvyre", "Miabella", "Reycaryn", "Inagella", "Oriphine", "Xildove"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Ralowarin", "Qinren", "Ianfaren", "Keamaris", "Normenor", "Glynceran", "Crabalar", "Yelven", "Wranberos", "Zinneiros"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = elfTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(elfTypes);
        String subType = elfTypes.remove(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 250) + 60;
        middleAged = (int) (Math.random() * 500) + 251;
        old = (int) (Math.random() * 750) + 501;
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
        allAges = (int) (Math.random() * 750) + 60;
        age = allAges;
        character.setAge(age);
    }

    public String toString(){
        return "Elf";
    }

}
