package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gladiator extends Background {

    public String toString(){ return "Gladiator"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("took an unfortunate twist when " + character.getPossessivePronoun().toLowerCase() + " community was attacked by a band of Bugbears and the survivors were taken back to their camp. They were all forced to fight in the arena as gladiators to amuse the Bugbears. " + character.getSubjectPronoun() + " luckily survived long enough to escape, but not without some haunting memories");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
