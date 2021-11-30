package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Druid extends Klass {

    @Override
    public String toString() { return "Druid"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String druid1 = " was deeply intertwined with " + character.getPossessivePronoun().toLowerCase() + " natural surroundings. " +
                " The force of nature was entrancing and " + character.getSubjectPronoun().toLowerCase() + " felt that " +
                " there maybe was even magic flowing with it. In fact, " + character.getSubjectPronoun().toLowerCase() +
                " ended up finding out that there is. ";
        String druid2 = "Over time " + character.getSubjectPronoun().toLowerCase() + " became adept at calling upon these " +
                "forces, becoming an extension of natures will and power. " + character.getSubjectPronoun() + " learned to " +
                " take on animal forms and cast spells that called on nature's elements";
        klassStory.add(druid1 + druid2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
