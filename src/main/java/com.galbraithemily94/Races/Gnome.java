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
    private String[] gnomeTypesArray = { "Forest", "Rock", "Deep" };


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
    public String[] getSubTypeArray() { return gnomeTypesArray; }

    @Override
    public void getRandomSubType(Character character) {
        List<String> gnomeTypes = new ArrayList<>(Arrays.asList(gnomeTypesArray));
        Collections.shuffle(gnomeTypes);
        String subType = gnomeTypes.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 25) + 16;
        middleAged = (int) (Math.random() * 160) + 41;
        old = (int) (Math.random() * 300) + 201;
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
        allAges = (int) (Math.random() * 485) + 16;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String gnome1 = " Gnomes have endless enthusiasm for life, despite how long they live they never get bored and instead worry of not having time for all they want to do.";
        String gnome2 = " Gnomes are known for the ingenuity as skilled engineers, alchemists, tinkers, and inventors.";
        earlyLives.add("encouraged to chase every last curiosity, from attempting flight to trying to dig straight through to the other side of the world." + gnome1 + " There was never a dull moment... unless a bone needed time to heal");
        earlyLives.add("helping design new toys at  " + character.getPossessivePronoun().toLowerCase() + "  parents shop in the city." + gnome2 + " Not all designs ended up a success... or safe, but some ended up being popular");
        earlyLives.add("passing from town to town with  " + character.getPossessivePronoun().toLowerCase() + " parents, selling remedies and chasing rare ingredients." + gnome2 + " Think honest snake oil salesman");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
