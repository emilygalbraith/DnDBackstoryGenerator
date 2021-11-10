package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rogue extends Klass {

    @Override
    public String toString() { return "Rogue"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String rogue1 = " was shaped by " + character.getPossessivePronoun().toLowerCase() + " natural skill for stealth and " +
                "deception. " + character.getSubjectPronoun() + " had a knack for uncovering someone's vulnerabilities, gaining " +
                "an advantage in almost any situation. " + character.getSubjectPronoun() + " practiced and became skilled with " +
                "an array of tools such as lock picks. ";
        String rogue2 = "Making use of " + character.getPossessivePronoun().toLowerCase() + " skills " + character.getSubjectPronoun().toLowerCase() +
                " could help solve almost any problem that stood in the way of a goal. While " + character.getSubjectPronoun().toLowerCase() +
                " couldn't match a fighter in combat, " + character.getSubjectPronoun().toLowerCase() + " could make use of " +
                character.getPossessivePronoun().toLowerCase() + " cunning to accomplish a similar outcome with one well planned strike";
        klassStory.add(rogue1 + rogue2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
