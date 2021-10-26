package com.galbraithemily94.Races;

import com.galbraithemily94.Race;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dwarf extends Race {
    //Instance variables
    private int young;
    private int middleAged;
    private int old;
    private int allAges;
    private List<String> dwarfTypes = new ArrayList<>(Arrays.asList("Hill", "Mountain", "Duergar", "Mark of Warding", "Kaladesh"));


    //Instance variables for character sheet
    private List<String> languages = new ArrayList<>(Arrays.asList("Common", "Dwarvish"));
    private int constitutionMod = 2;
    private String alignment; //Most dwarves tend to be lawful and good.
    private String size = "Medium";
    private int height; //between 4 and 5ft tall
    private int weight; //average 150lbs
    private int speed = 25;
    private int darkvision = 60;

    @Override
    public void getRandomName(Character character) {
        List<String> clanNames = new ArrayList<>(Arrays.asList("Loudstorm", "Bronzebelch", "Stormsong", "Bezzaln", "Caerigert", "Darkaxe", "Firststone", "Keenaxe", "Bellavork", "Wildhelm"));
        List<String> femaleNames = new ArrayList<>(Arrays.asList("Katbera", "Naernys", "Lysmera", "Tismura", "Bylnora", "Nasmora", "Runsael", "Kaitnura", "Tizros", "Soltyn"));
        List<String> maleNames = new ArrayList<>(Arrays.asList("Krumram", "Farnom", "Randain", "Dolnik", "Thonur", "Tymar", "Vondohr", "Grenren", "Belnyl", "Belgurn"));
        String name = super.getRandomName(character, femaleNames, maleNames, clanNames);
        character.setName(name);
    }


    public String toString(){
        return "Dwarf";
    }


    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = dwarfTypes.toArray(new String[0]);
        return subTypeArray;
    }

    @Override
    public void getRandomSubType(Character character) {
        Collections.shuffle(dwarfTypes);
        String subType = dwarfTypes.get(0);
        character.setRaceSubType(subType);
    }

    @Override
    public void getRandomAge(Character character, String ageRange) {
        int age = 0;
        young = (int) (Math.random() * 50) + 16;
        middleAged = (int) (Math.random() * 175) + 51;
        old = (int) (Math.random() * 350) + 176;
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
        allAges = (int) (Math.random() * 350) + 16;
        age = allAges;
        character.setAge(age);
    }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String dwarf1 = " To dwarves loyalty is a way of life that should striven for and rewarded.";
        String dwarf2 = " Dwarves are known for their masterful craftsmanship and avarice.";
        earlyLives.add("amongst the distant sound of pickaxes clashing with rock." + dwarf2 + " Helping mine mythril was hard and proud work, as it enabled the clan to both create legendary weapons and amass wealth");
        earlyLives.add("with dreams of taking a spot in the Queen's guard." + dwarf1 + " Generations of " + character.getPossessivePronoun().toLowerCase() + " family were honored members of this guard. A testament to their steadfast loyalty");
        earlyLives.add("listening to passionate lectures on the crafting of fine jewelry." + dwarf2 + " The fact that " + character.getPossessivePronoun().toLowerCase() + " family's pieces decorated the King himself meant they were the best of the best");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
