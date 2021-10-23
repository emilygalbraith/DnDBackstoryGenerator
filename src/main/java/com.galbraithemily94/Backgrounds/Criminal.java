package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Criminal extends Background {

    public String toString(){ return "Criminal"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("took a turn the first time " + character.getSubjectPronoun().toLowerCase() + " stole. " + character.getSubjectPronoun() + " became addicted to the rush, nothing ever felt quite so exciting.\nWith each heist " + character.getPossessivePronoun().toLowerCase() + "reputation grew. Eventually" + character.getSubjectPronoun().toLowerCase() + " became an established criminal and fence");
        earlyLives.add("changed after being approached by an unfamiliar individual who asked for a seemingly harmless favor, in exchange for some decent money.\n They only needed a bundle of food to be delivered to a friend. " + character.getSubjectPronoun().toLowerCase() + " didn't see the harm, until the next day when the streets were filled with talk of a murder via poisoning.\nWith the threat of being exposed as responsible for the murder, " + character.getSubjectPronoun() + " saw no alternative but to comply with each additional task sent");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}