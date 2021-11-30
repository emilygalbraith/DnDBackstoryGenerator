package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cleric extends Klass {

    @Override
    public String toString() { return "Cleric"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String cleric1 = " became shaped by " + character.getPossessivePronoun().toLowerCase() + " ever growing relationship " +
                " with a deity. It is hard to say exactly when, but at some point, " + character.getSubjectPronoun().toLowerCase() +
                " started to feel an even deeper intuitive connection and power inside. ";
        String cleric2 = "As " + character.getPossessivePronoun().toLowerCase() + " devotion grew, so did " +
                character.getPossessivePronoun().toLowerCase() + " intuitive sense of " + character.getPossessivePronoun().toLowerCase() +
                " deity's will. With that came increasing ability to heal, inspire, and many other magical powers";
        klassStory.add(cleric1 + cleric2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
