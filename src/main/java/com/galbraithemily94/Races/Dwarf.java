package com.galbraithemily94.Races;

import com.galbraithemily94.Race;
import com.galbraithemily94.Character;
public class Dwarf extends Race {

    public String toString(){
        return "Dwarf";
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
