package com.galbraithemily94.background;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pirate extends Background {

    public String toString(){ return "Pirate"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String pirate1 = " changed course after hearing the story of an adventurer at sea. " + character.getSubjectPronoun() +
                " dreamed from that day forth of all the discoveries and adventures that lay in wait beyond the ocean's horizon. " +
                "Unfortunately, during " + character.getPossessivePronoun().toLowerCase() + " first voyage at sea " +
                character.getPossessivePronoun().toLowerCase() + " ship was overtaken by pirates. " +
                character.getSubjectPronoun() + " lived as a slave among the pirates for a good while, until one day " +
                character.getSubjectPronoun().toLowerCase() + " joined their ranks. ";
        earlyLives.add(pirate1 + character.getName() + " began working as the cook for the crew");
        earlyLives.add(pirate1 + character.getName() + " became the first mate and second in command");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
