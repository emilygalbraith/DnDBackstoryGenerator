package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dragonborn extends Race {
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    List<String> draconicAncestryList = new ArrayList<>(Arrays.asList("Black", "Blue", "Brass", "Bronze", "Copper", "Gold", "Green", "Red", "Silver", "White"));


    //Below are things for character sheet creation.
    List<String> languages = new ArrayList<>(Arrays.asList("Common", "Draconic"));
    private String size = "medium";
    private int height; //Standing well over 6 feet tall
    private int weight; //Averaging at almost 300lbs
    private String alignment; //Tend towards good or evil in extremes
    private int speed = 30;
    private int strengthMod = 2;
    private int charismaMod = 1;
    private int darkvision = 0;

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
        Collections.shuffle(nickname);
        Collections.shuffle(clanNames);
        String name = clanNames.remove(0) + " " + super.getRandomName(character, femaleNames, maleNames) + nickname.remove(0);
        character.setName(name);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 30) + 6;
        middleAged = (int) (Math.random() * 50) + 31;
        old = (int) (Math.random() * 80) + 51;
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
        allAges = (int) (Math.random() * 80) + 6;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = draconicAncestryList.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(draconicAncestryList);
        String draconicAncestry = draconicAncestryList.get(0);
        character.setRaceSubType(draconicAncestry);
    }

    @Override
    public String toString(){
        return "Dragonborn";
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String dragonborn1 = " Dragonborn are typically raised by one parent 3 years after hatching with help of whole clan.";
        String dragonborn2 = " To a Dragonborn, honor is more important than life itself, and cowardice outright repulsive.";
        earlyLives.add("a diligent student under the guidance of the whole clan. " + dragonborn1 + " Each elder helped excellence be achieved through lectures on clan history, combat, various trades, and honor");
        earlyLives.add("amongst the disapproving and constant gazes of the clan. " + dragonborn2 + " Turns out, the elders and clan additionally didn't appreciate a care free spirit prone to mischief and pranks");
        earlyLives.add("as the child of the clan leader with high expectations to meet. " + dragonborn2 + " Obsessive training led to basking in praise of the clan");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
