package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Monk extends Klass {

    @Override
    public String toString() { return "Monk"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String monk1 = " found direction from an unusual magic. " + character.getSubjectPronoun() + " could feel it flowing " +
                "through " + character.getPossessivePronoun().toLowerCase() + " body as he moved, especially when moving with " +
                "intention. " + character.getSubjectPronoun() + " started to start every day with practicing martial arts " +
                "as it felt strongest then. ";
        String monk2 = character.getSubjectPronoun() + " found a word for this power, ki. " + character.getSubjectPronoun() +
                " learned how to harness this power to exceed " + character.getPossessivePronoun().toLowerCase() + " capabilities. " +
                character.getSubjectPronoun() + " could gain speed and strength, and even disrupt an opponent's ki";
        klassStory.add(monk1 + monk2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
