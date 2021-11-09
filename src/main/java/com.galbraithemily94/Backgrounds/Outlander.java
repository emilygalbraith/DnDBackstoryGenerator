package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Outlander extends Background {

    public String toString(){ return "Outlander"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String outlander1 = "ended up being spent more and more out in the wild as " + character.getPossessivePronoun().toLowerCase() +
                " skills for survival began to shine. ";
        String outlander2 = " Then one day, home became the wilderness. " + character.getSubjectPronoun();
        earlyLives.add(outlander1 + outlander2 + " occasionally takes on work as a guide now");
        earlyLives.add(outlander1 + outlander2 + " now occasionally will make money as a trapper");
        earlyLives.add(outlander1 + outlander2 + " primarily lived in isolation as a hunter-gatherer in harmony with nature");
        earlyLives.add(outlander1 + outlander2 + " will occasionally take on work as a bounty hunter, as it allows for " +
                "plenty of time traversing unexplored lands");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
