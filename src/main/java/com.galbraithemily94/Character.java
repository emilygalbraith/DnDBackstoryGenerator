package com.galbraithemily94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Character {
    private String characterRace;
    private Class characterClass;
    private Location characterLocation;
    private Background characterBackground;

    //Constructor if they want the character to be completely random.
    public Character() {
        characterRace = generateRandomRace();
    }
//    //Constructor if they want to pick race, actually may use setters instead
//    public Character(String characterRace) {
//        this.characterRace = characterRace;
//    }

    public String getCharacterRace() { return characterRace; }
    public void setCharacterRace(String characterRace) { this.characterRace = characterRace; }

    //Generate A Random Race By Calling Method in Race Class
    public String generateRandomRace() {
        Race randomRace = new Race();
        return randomRace.getRandomCharacterRace();
    }
}
