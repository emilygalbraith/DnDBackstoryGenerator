package com.galbraithemily94.Races;

import com.galbraithemily94.Character;
import com.galbraithemily94.Race;

public class Human extends Race {

    public String toString(){
        return "Human";
    }

    @Override
    public String[] getSubTypeArray() {
        String[] subTypeArray = new String[0];
        return subTypeArray;
    }

    @Override
    public void getRandomAge(Character character, String ageRange){ character.setAge(1); }
    @Override
    public void getRandomAge(Character character) { character.setAge(1); }
}
