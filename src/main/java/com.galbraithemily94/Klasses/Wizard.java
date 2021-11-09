package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wizard extends Klass {

    @Override
    public String toString() { return "Wizard"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String wizard1 = "";
        String wizard2 = "";
        klassStory.add(wizard1 + wizard2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Wild and enigmatic, varied in form and function, the power of magic draws students who seek to master its mysteries.
//    Some aspire to become like the gods, shaping reality itself. Though the casting of a typical spell requires merely
//    the utterance of a few strange words, fleeting gestures, and sometimes a pinch or clump of exotic materials, these
//    surface components barely hint at the expertise attained after years of apprenticeship and countless hours of study.
//    Wizards live and die by their spells. Everything else is secondary. They learn new spells as they experiment and
//    grow in experience. They can also learn them from other wizards, from ancient tomes or inscriptions, and from ancient
//    creatures (such as the fey) that are steeped in magic.
}
