package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

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
    private List<String> tieflingTypes = new ArrayList<>(Arrays.asList("Asmodeus", "Baalzebul", "Dispatcher", "Fierna", "Glasya", "Levistus", "Mammon", "Mephistopheles", "Zariel", "Abyssal"));


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
        String[] subTypeArray = tieflingTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(tieflingTypes);
        String subType = tieflingTypes.remove(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 30) + 16;
        middleAged = (int) (Math.random() * 50) + 31;
        old = (int) (Math.random() * 90) + 51;
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
        allAges = (int) (Math.random() * 90) + 16;
        age = allAges;
        character.setAge(age);
    }
}
