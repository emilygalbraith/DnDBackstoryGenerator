package com.galbraithemily94.klass;

import com.galbraithemily94.Character;

public class Barbarian extends Klass {

    @Override
    public String toString() { return "Barbarian"; }

    @Override
    public String getKlassStory(Character character) {
        String barbarian = "ended up being shaped mostly by " + character.getPossessivePronoun().toLowerCase() + " primal ferocity. " +
                "It seems " + character.getPossessivePronoun().toLowerCase() + " strength and prowess is unmatched, especially after" +
                " being enraged. " + character.getPossessivePronoun() + " talent for violence is valued, sough out, and feared. "
                + " Often times, " + character.getPossessivePronoun().toLowerCase() + " name and barbarian end up together" +
                " in the same sentence";
        return barbarian;
    }

}
