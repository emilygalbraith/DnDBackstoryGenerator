package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Acolyte extends Background {
    private List<String> earlyLife = new ArrayList<>();

    public String toString(){ return "Acolyte"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("changed for good when " + character.getPossessivePronoun().toLowerCase() + " parents died. Overwhelmed and alone, there seemed to be little hope until a priest took " + character.getObjectPronoun().toLowerCase() + " in.\nBecoming an acolyte saved " + character.getPossessivePronoun().toLowerCase() + " , and " + character.getPossessivePronoun().toLowerCase() + " bond to the priest will not be one forgotten");
        earlyLives.add("took a turn when " + character.getSubjectPronoun().toLowerCase() + " overhead a priest preaching out front of a temple. Over time becoming an acolyte there even.\nNow " + character.getSubjectPronoun().toLowerCase() + " no longer finds the seemingly chaotic nature of the world mystifying, and instead see omens. Messages and direction waiting to be read");
        earlyLives.add("changed when " + character.getSubjectPronoun().toLowerCase() + " found something " + character.getSubjectPronoun().toLowerCase() + " didn't even realize was missing. Faith. Becoming an acolyte changed it all.\nThe aspiration to prove " + character.getPossessivePronoun().toLowerCase() + " worthiness of their god's favor matters above all");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
