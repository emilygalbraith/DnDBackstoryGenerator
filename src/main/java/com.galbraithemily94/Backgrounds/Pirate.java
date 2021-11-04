package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
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
        String pirate1 = " changed course after hearing the story of an adventurer at sea. " + character.getSubjectPronoun() + " dreamed from that day forth of all the discoveries and adventures that lay in wait beyond the ocean's horizon. ";
        String pirate2 = "Unfortunately, during " + character.getPossessivePronoun().toLowerCase() + " first voyage at sea " + character.getPossessivePronoun().toLowerCase() + " ship was overtaken by pirates. ";
        String pirate3 = character.getSubjectPronoun() + " lived as a slave among the pirates for a good while, until one day " + character.getSubjectPronoun().toLowerCase() + " joined their ranks. ";
        earlyLives.add(pirate1 + pirate2 + pirate3 + "Now " + character.getName() + " works as the cook for the crew");
        earlyLives.add(pirate1 + pirate2 + pirate3 + "Now " + character.getName() + " is the first mate and second in command");
        earlyLives.add(pirate1 + pirate2 + pirate3 + "Now " + character.getName() + " dreams of mutiny and becoming the most notorious pirate on the seas");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
