package com.galbraithemily94.Races;
import com.galbraithemily94.Race;

public class Dragonborn extends Race {
    private int speed = 30;
    private int strengthMod = 2;
    private int charismaMod = 1;
    private String alignment; //Tend towards good or evil in extremes
    private String size = "medium";
    private int height; //Standing well over 6 feet tall
    private int weight; //Averaging at almost 250lbs
    //Need to add list or something for Draconic Ancestry, Dragon Color, Damage type, and breath weapon


    public int getSpeed() { return speed; }
    public int getStrengthMod() { return strengthMod; }
    public int getCharismaMod() { return charismaMod; }
    public int getAge() {
        int age = 0;
        //needs to be between 6 - 80, age quickly and die around 80
        //young 6 - 30 middle age 31 - 50 old 50 - 80
        return age;
    }

    @Override
    public String toString(){
        return "Dragonbron";
    }
}
