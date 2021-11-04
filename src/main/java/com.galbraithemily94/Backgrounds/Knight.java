package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knight extends Background {

    public String toString(){ return "Knight"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        earlyLives.add("was rather ordinary, until " + character.getSubjectPronoun().toLowerCase() + " was on the cusp of adulthood when " + character.getSubjectPronoun().toLowerCase() + " was recognized for a brave deed and knighted");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }


}
