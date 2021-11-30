package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bard extends Klass {

    @Override
    public String toString() { return "Bard"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String bard1 = " became shaped by sounds and vibrations. " + character.getSubjectPronoun() + " could feel something, " +
                "a power, in words and song that it seemed no one else could. " + character.getSubjectPronoun() + " began " +
                "to experiment weaving magic with their words and music. ";
        String bard2 = "One day while singing, " + character.getSubjectPronoun().toLowerCase() + " unintentionally succeeded" +
                " in harnessing that power and saw a cut on " + character.getPossessivePronoun().toLowerCase() +
                " own arm heal right before " + character.getPossessivePronoun().toLowerCase() + " own eyes. ";
        String bard3 = "After that " + character.getSubjectPronoun().toLowerCase() + " practiced day and night, using " +
                character.getPossessivePronoun().toLowerCase() + " voice to weave magic through the air";
        String bard4 = "After that " + character.getSubjectPronoun().toLowerCase() + " sought out a bard capable of magic " +
                "to teach " + character.getObjectPronoun().toLowerCase() + ". " + character.getSubjectPronoun() + " learned " +
                " about how the world was spoken into existence by the gods and how echoes of those words of creation still " +
                "can be found all around. A bard's magic is in harnessing and weaving those echoes into spells";
        klassStory.add(bard1 + bard2 + bard3);
        klassStory.add(bard1 + bard2 + bard4);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
