package com.galbraithemily94.background;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sage extends Background {

    public String toString(){ return "Sage"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        String sage1 = " ended up, to the surprise of everyone, being spent with " + character.getPossessivePronoun().toLowerCase() +
                " nose in a book at all times. Not just when " + character.getSubjectPronoun().toLowerCase() + " was supposed to. ";
        earlyLives.add(sage1 + character.getSubjectPronoun() + " was enamoured with the stars and wanted to become a renowned astronomer");
        earlyLives.add(sage1 + character.getPossessivePronoun() + " scholarly efforts were eventually recognized by a wizard who recruited " + character.getObjectPronoun().toLowerCase() + " as an apprentice");
        earlyLives.add(sage1 + character.getSubjectPronoun() + " loved using " + character.getPossessivePronoun().toLowerCase()
                + " knowledge to try and create new potions. Eventually " + character.getSubjectPronoun().toLowerCase() +
                " became a well known alchemist whose potions were ordered and sought by all");
        earlyLives.add(sage1 + character.getSubjectPronoun() + " spent so much time in the library, that often times " +
                character.getSubjectPronoun().toLowerCase() + " would often end up falling asleep on a desk. People just " +
                "began to assume " + character.getSubjectPronoun().toLowerCase() + " was a librarian, and so " +
                character.getSubjectPronoun().toLowerCase() + " became one");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
