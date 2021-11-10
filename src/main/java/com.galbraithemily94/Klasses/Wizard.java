package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wizard extends Klass {

    @Override
    public String toString() { return "Wizard"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String wizard1 = " was spent in the pursuit of magic, " + character.getSubjectPronoun().toLowerCase() + " spent " +
                "countless hours studying and practicing. At first combining the strange words, gestures, and occasional ingredients " +
                "felt foreign, and " + character.getSubjectPronoun().toLowerCase() + " was only capable of weak spells. " +
                "However, with each book read and secret chased down " + character.getPossessivePronoun().toLowerCase() +
                " power and capability grew. ";
        String wizard2 = " Now " + character.getSubjectPronoun().toLowerCase() + " proudly claims the title Wizard";
        klassStory.add(wizard1 + wizard2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
