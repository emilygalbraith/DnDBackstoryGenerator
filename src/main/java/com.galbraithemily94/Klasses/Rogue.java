package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rogue extends Klass {

    @Override
    public String toString() { return "Rogue"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String rogue1 = "";
        String rogue2 = "";
        klassStory.add(rogue1 + rogue2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Rogues rely on skill, stealth, and their foes’ vulnerabilities to get the upper hand in any situation. They have a
//    knack for finding the solution to just about any problem, demonstrating a resourcefulness and versatility that is
//    the cornerstone of any successful adventuring party.
}
