package com.galbraithemily94.Races;
import com.galbraithemily94.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dragonborn extends Race {
    private int speed = 30;
    private int strengthMod = 2;
    private int charismaMod = 1;
    private String alignment; //Tend towards good or evil in extremes
    private String size = "medium";
    private int height; //Standing well over 6 feet tall
    private int weight; //Averaging at almost 250lbs
    List<String> draconicAncestryList = new ArrayList<>(Arrays.asList("Black", "Blue", "Brass", "Bronze", "Copper", "Gold", "Green", "Red", "Silver", "White"));
    private String name; //Clan name first(long and complex), personal name simple 1/2 syllables, soft tones, female begin of alpha, males middle

    public int getSpeed() { return speed; }
    public int getStrengthMod() { return strengthMod; }
    public int getCharismaMod() { return charismaMod; }
    public int getAge() {
        int age = 0;
        //needs to be between 6 - 80, age quickly and die around 80
        //young 6 - 30 middle age 31 - 50 old 50 - 80
        return age;
    }

    public void draconicAncestryListToString() {
        for (String ancestry : draconicAncestryList) {
            System.out.print(ancestry + " ");
        }
        System.out.println("");
    }

    public String getRandomDraconicAncestry() {
        Collections.shuffle(draconicAncestryList);
        String draconicAncestry = draconicAncestryList.remove(0);
        return draconicAncestry;
    }

    @Override
    public String toString(){
        return "Dragonborn";
    }
}
