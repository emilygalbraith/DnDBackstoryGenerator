package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warlock extends Klass {

    @Override
    public String toString() { return "Warlock"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String warlock1 = "";
        String warlock2 = "";
        klassStory.add(warlock1 + warlock2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Warlocks are seekers of the knowledge that lies hidden in the fabric of the multiverse. Through pacts made with
//    mysterious beings of supernatural power, warlocks unlock magical effects both subtle and spectacular. Drawing on
//    the ancient knowledge of beings such as fey nobles, demons, devils, hags, and alien entities of the Far Realm,
//    warlocks piece together arcane secrets to bolster their own power.
//    A warlock is defined by a pact with an otherworldly being. Sometimes the relationship between warlock and patron
//    is like that of a cleric and a deity, though the beings that serve as patrons for warlocks are not gods. A warlock
//    might lead a cult dedicated to a demon prince, an archdevil, or an utterly alien entity—beings not typically served
//    by clerics. More often, though, the arrangement is similar to that between a master and an apprentice. The warlock
//    learns and grows in power, at the cost of occasional services performed on the patron’s behalf.
//    The magic bestowed on a warlock ranges from minor but lasting alterations to the warlock’s being (such as the
//    ability to see in darkness or to read any language) to access to powerful spells. Unlike bookish wizards, warlocks
//    supplement their magic with some facility at hand-to-hand combat. They are comfortable in light armor and know how
//    to use simple weapons.

}
