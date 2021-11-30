package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorcerer extends Klass {

    @Override
    public String toString() { return "Sorcerer"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String sorcerer1 = " nearly came to the end after being ambushed while traveling. " + character.getSubjectPronoun() +
                " died, and while passing onto the realm of dead saw clearly the inner workings of reality and life. " +
                "Then a passing cleric casted a powerful healing spell and pulled " + character.getObjectPronoun().toLowerCase() +
                " back to the living. Something had changed however, now " + character.getPossessivePronoun().toLowerCase() +
                " body, mind, and spirit were coursing with power and magic. ";
        String sorcerer2 = " At first containing this new magic was chaotic and it would manifest in uncontrollable ways. " +
                "In time " + character.getSubjectPronoun().toLowerCase() + " learned to control and use this magic in powerful ways";
        klassStory.add(sorcerer1 + sorcerer2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
}
