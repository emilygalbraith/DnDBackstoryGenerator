package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hermit extends Background {

    public String toString(){ return "Hermit"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        earlyLives.add(", unfortunately, ended up being marked by tragedy. " + character.getPossessivePronoun() +
                " entire family died in a house fire. " + character.getSubjectPronoun() + " was deep in despair, and " +
                "ended up retreating from society to live a life of seclusion");
        earlyLives.add("took an unexpected turn as " + character.getSubjectPronoun().toLowerCase() + "started to feel an " +
                "inexplicable call, if you will, from nature. Finally, " + character.getSubjectPronoun().toLowerCase() +
                " had to heed this call, however odd, and went to commune with nature, far from civilization");
        earlyLives.add("was marked by what was missing, this void, that left " + character.getSubjectPronoun().toLowerCase()
                + " feeling empty and incomplete. Eventually, " + character.getSubjectPronoun().toLowerCase() + " decided" +
                " to leave everything " + character.getSubjectPronoun().toLowerCase() + " knew and live in seclusion. " +
                "Hoping some form of spiritual enlightenment would come from it that would banish this void");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
