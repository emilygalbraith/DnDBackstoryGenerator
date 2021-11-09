package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cleric extends Klass {

    @Override
    public String toString() { return "Cleric"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String cleric1 = "";
        String cleric2 = "";
        klassStory.add(cleric1 + cleric2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Clerics are intermediaries between the mortal world and the distant planes of the gods. As varied as the gods they
//    serve, clerics strive to embody the handiwork of their deities. No ordinary priest, a cleric is imbued with divine magic.
//    Divine magic, as the name suggests, is the power of the gods, flowing from them into the world. Clerics are conduits
//    for that power, manifesting it as miraculous effects. The gods don’t grant this power to everyone who seeks it,
//    but only to those chosen to fulfill a high calling. Harnessing divine magic doesn’t rely on study or training.
//    A cleric might learn formulaic prayers and ancient rites, but the ability to cast cleric spells relies on devotion
//    and an intuitive sense of a deity’s wishes. Clerics combine the helpful magic of healing and inspiring their allies
//    with spells that harm and hinder foes. They can provoke awe and dread, lay curses of plague or poison, and even
//    call down flames from heaven to consume their enemies. For those evildoers who will benefit most from a mace to the
//    head, clerics depend on their combat training to let them wade into melee with the power of the gods on their side.
}
