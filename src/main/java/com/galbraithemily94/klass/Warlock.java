package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warlock extends Klass {

    @Override
    public String toString() { return "Warlock"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String warlock1 = " was spent seeking magic and knowledge of how it works. It seemed so much could be done " +
                "and made right if " + character.getSubjectPronoun().toLowerCase() + " could just gain that power for " +
                character.getPossessivePronoun().toLowerCase() + " own. Then an unexpected opportunity arouse, " +
                character.getSubjectPronoun().toLowerCase() + " received an offer from a mysterious and supernatural being. " +
                "In exchange for occasional favors, this being would offer them powerful magic. ";
        String warlock2 = character.getSubjectPronoun() + " didn't think about it long before agreeing";
        klassStory.add(warlock1 + warlock2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
