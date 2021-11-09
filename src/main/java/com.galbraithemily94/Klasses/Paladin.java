package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paladin extends Klass {

    @Override
    public String toString() { return "Paladin"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String paladin1 = "";
        String paladin2 = "";
        klassStory.add(paladin1 + paladin2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    A paladin swears to uphold justice and righteousness, to stand with the good things of the world against the encroaching
//    darkness, and to hunt the forces of evil wherever they lurk. Different paladins focus on various aspects of the cause of
//    righteousness, but all are bound by the oaths that grant them power to do their sacred work. Although many paladins
//    are devoted to gods of good, a paladin’s power comes as much from a commitment to justice itself as it does from a god.
//    Paladins train for years to learn the skills of combat, mastering a variety of weapons and armor. Even so,
//    their martial skills are secondary to the magical power they wield: power to heal the sick and injured, to smite the
//    wicked and the undead, and to protect the innocent and those who join them in the fight for justice.

}
