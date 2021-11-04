package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Sailor extends Background {

    public String toString(){ return "Sailor"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String sailor1 = " changed course after hearing the story of an adventurer at sea. " + character.getSubjectPronoun() + " dreamed from that day forth of all the discoveries and adventures that lay in wait beyond the ocean's horizon. ";
        String sailor2 = "As soon as " + character.getSubjectPronoun().toLowerCase() + " could " + character.getSubjectPronoun().toLowerCase() + " joined the crew of the first vessel who would have " + character.getObjectPronoun().toLowerCase();
        earlyLives.add(sailor1 + sailor2);
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
