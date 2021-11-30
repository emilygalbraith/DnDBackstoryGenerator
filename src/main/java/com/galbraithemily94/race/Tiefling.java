package com.galbraithemily94.race;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tiefling extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private String[] tieflingTypes = {"Asmodeus", "Baalzebul", "Dispatcher", "Fierna", "Glasya", "Levistus", "Mammon", "Mephistopheles", "Zariel", "Abyssal"};


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Infernal"));
    private int charismaMod = 2;
    private String alignment; // Tend to chaotic
    private String size = "Medium";
    private int height; //between 5 and 6ft tall
    private int weight;
    private int speed = 30;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Lilitu", "Sifkhu", "Tyranthraxus", "Veshvoriak", "Asmodeus", "Carnago", "Szereban", "Grimto", "Shehata", "Mouggi"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Sarxibis", "Zeyola", "Yaza", "Velwala", "Natfirith", "Temerity", "Bliss", "Mayhem", "Zamaia", "Necria"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Gudos", "Zerdos", "Zormong", "Ralrakas", "Kaivius", "Dread", "Euphoria", "Ebmenos", "Sirros", "Nephzer"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Tiefling";
    }


    @Override
    public String[] getSubTypeArray() {
        return tieflingTypes;
    }

    @Override
    public void getRandomSubType(Character character) {
        List<String> tieflingTypeList = new ArrayList<>(Arrays.asList(tieflingTypes));
        Collections.shuffle(tieflingTypeList);
        String subType = tieflingTypeList.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 15) + 16;
        middleAged = (int) (Math.random() * 20) + 31;
        old = (int) (Math.random() * 40) + 51;
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
        allAges = (int) (Math.random() * 75) + 16;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null){
            character.setRandomGender();
        }
        String tiefling1 = " Tieflings tend to be proud and secretive by nature.";
        String tiefling2 = " Due to their evil ancestry, Tieflings are often unfairly outright hated.";
        earlyLives.add("in a small city where " + character.getPossessivePronoun().toLowerCase() + " parents owned a small shop." + tiefling2 + " Despite the terrible treatment, they were determined to change people's perception");
        earlyLives.add("amongst a thieves guild in bustling city." + tiefling1 + " Many of the Tieflings in this guild saw it as a chance to get even for wrongs done to them");
        earlyLives.add("traveling from village to village selling wares." + tiefling2 + " It was easier to live a nomadic life than deal with peoples' hostilities");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
