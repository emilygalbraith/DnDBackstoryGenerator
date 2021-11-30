package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paladin extends Klass {

    @Override
    public String toString() { return "Paladin"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String paladin1 = " defined by a desire to do good and help people. When " + character.getSubjectPronoun().toLowerCase() +
                " met a paladin, " + character.getSubjectPronoun().toLowerCase() + " immediately wanted to learn " +
                "all about that paladin's life. The paladin explained how their order works, how they swear oaths to stand for " +
                "the good things of the world and fight evil. Paladins draw their power and magic from those oaths and their " +
                "commitment to justice. ";
        String paladin2 = character.getSubjectPronoun() + " ended up joining that order and swearing those sacred oaths. " +
                character.getSubjectPronoun() + " began " + character.getPossessivePronoun().toLowerCase() + " training as soon" +
                " as possible. The training consisted of mastering a variety of weapons and armor, as well as learning to wield " +
                "the magical power to heal, smite, and protect";
        klassStory.add(paladin1 + paladin2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

}
