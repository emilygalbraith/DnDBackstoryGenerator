package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Fighter extends Klass {

    @Override
    public String toString() { return "Fighter"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String fighter1 = " was spent mastering every combat style " + character.getSubjectPronoun().toLowerCase() + " that " +
                character.getSubjectPronoun().toLowerCase() + " came across. " + character.getSubjectPronoun() + " was skilled " +
                "with an axe, rapier, longsword, greatsword, bow, and even traps. You name it, and most likely " +
                character.getSubjectPronoun().toLowerCase() + "  can do it.";
        String fighter2 = " The only thing left to do is to focus in on one style and master it fully";
        klassStory.add(fighter1 + fighter2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
