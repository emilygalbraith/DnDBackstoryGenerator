package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranger extends Klass {

    @Override
    public String toString() { return "Ranger"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String ranger1 = "";
        String ranger2 = "";
        klassStory.add(ranger1 + ranger2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Warriors of the wilderness, rangers specialize in hunting the monsters that threaten the edges of civilization—humanoid
//    raiders, rampaging beasts and monstrosities, terrible giants, and deadly dragons. They learn to track their quarry
//    as a predator does, moving stealthily through the wilds and hiding themselves in brush and rubble. Rangers focus
//    their combat training on techniques that are particularly useful against their specific favored foes.
//    Thanks to their familiarity with the wilds, rangers acquire the ability to cast spells that harness nature’s power,
//    much as a druid does. Their spells, like their combat abilities, emphasize speed, stealth, and the hunt. A ranger’s
//    talents and abilities are honed with deadly focus on the grim task of protecting the borderlands.
}
