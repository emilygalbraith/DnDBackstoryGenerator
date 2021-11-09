package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monk extends Klass {

    @Override
    public String toString() { return "Monk"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String monk1 = "";
        String monk2 = "";
        klassStory.add(monk1 + monk2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Monks make careful study of a magical energy that most monastic traditions call ki. This energy is an element of
//    the magic that suffuses the multiverse—specifically, the element that flows through living bodies. Monks harness
//    this power within themselves to create magical effects and exceed their bodies’ physical capabilities, and some of
//    their special attacks can hinder the flow of ki in their opponents. Using this energy, monks channel uncanny speed
//    and strength into their unarmed strikes. As they gain experience, their martial training and their mastery of ki
//    gives them more power over their bodies and the bodies of their foes.
}
