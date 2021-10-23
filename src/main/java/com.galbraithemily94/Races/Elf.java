package com.galbraithemily94.Races;
import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

import java.util.*;

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
        String subType = elfTypes.get(0);
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

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String elf1 = "\nElves desire to live in balance with the wild, understand it rather than control it.";
        String elf2 = "\nElves value the pursuit of arcane knowledge and the written word.";
        String elf3 = "\nDue to their long lives, elves value tradition and careful action.";
        earlyLives.add("listening to  " + character.getPossessivePronoun().toLowerCase() + "  mother's playful and educational songs about the wildlife while exploring." + elf1 + "\nCombine that with being a druid, it was her greatest hope to guide her child to intimately understand the wild");
        earlyLives.add("studying ancient tomes alongside the other children." + elf2 + "\nIt was assumed they all would become wizards in time");
        earlyLives.add("as the child of the clan's oracle, listening and watching prophecies be shared." + elf3 + "\nThese prophecies were deeply rooted in tradition here, no important call was made without consulting the oracle");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
