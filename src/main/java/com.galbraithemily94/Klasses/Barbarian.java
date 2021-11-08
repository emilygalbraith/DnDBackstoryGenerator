package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Barbarian extends Klass {

    @Override
    public String toString() { return "Barbarian"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String barbarian1 = " being shaped by " + character.getPossessivePronoun().toLowerCase() + " primal ferocity. " +
                "It seemed " + character.getPossessivePronoun().toLowerCase() + " strength and prowess was unmatched, especially after" +
                " being enraged. ";
        String barbarian2 = character.getPossessivePronoun() + " talent for violence was valued, sough out, and feared. "
                + character.getSubjectPronoun() + " often was described using the word barbarian";
        klassStory.add(barbarian1 + barbarian2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

}
