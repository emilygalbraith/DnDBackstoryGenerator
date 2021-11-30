package com.galbraithemily94.background;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Criminal extends Background {

    public String toString(){ return "Criminal"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        earlyLives.add("took a turn the first time " + character.getSubjectPronoun().toLowerCase() + " stole. " + character.getSubjectPronoun() + " became addicted to the rush, nothing ever felt quite so exciting. With each heist " + character.getPossessivePronoun().toLowerCase() + " reputation grew. Eventually " + character.getSubjectPronoun().toLowerCase() + " became an established criminal and fence");
        earlyLives.add("changed after being approached by an unfamiliar individual who asked for a seemingly harmless favor in exchange for some decent money. They only needed a bundle of food to be delivered to a friend. " + character.getSubjectPronoun() + " didn't see the harm, until the next day when the streets were filled with talk of a murder via poisoning. With the threat of being exposed as responsible for the murder, " + character.getSubjectPronoun().toLowerCase() + " saw no alternative but to comply with each additional task sent");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
