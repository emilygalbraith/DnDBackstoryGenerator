package com.galbraithemily94.background;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soldier extends Background {

    public String toString(){ return "Soldier"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String soldier1 = " was spent imagining being the hero and soldier in stories. " + character.getSubjectPronoun() +
                " wanted the glory, fame, and adventures those heroes enjoyed. ";
        String soldier2 = "So when the call came for all able bodies to join the war effort " + character.getSubjectPronoun().toLowerCase()
                + " joined up immediately. ";
        String soldier3 = "It turned out there is a lot left out of stories of war, such as how it is mostly various " +
                "forms of uncomfortable boredom with brief periods of pure terror and adrenaline. ";
        earlyLives.add(soldier1 + soldier2 + soldier3 + character.getSubjectPronoun() + " kept going, clinging to the " +
                "belief it is all for the greater good");
        earlyLives.add(soldier1 + soldier2 + soldier3 + character.getSubjectPronoun() + " now has no more illusions about" +
                " war after seeing so many friends die");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
