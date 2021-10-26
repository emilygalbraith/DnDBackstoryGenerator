package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Charlatan extends Background {

    public String toString(){ return "Charlatan"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("changed when " + character.getSubjectPronoun().toLowerCase() + " realized just how useful people skills could be. With a few leading questions " + character.getSubjectPronoun().toLowerCase() + " could read almost anyone like a children's book. Over time this lead to " + character.getPossessivePronoun().toLowerCase() + " true self always hiding behind a mask. Showing people what they want to get " + character.getPossessivePronoun().toLowerCase() + " needs met");
        earlyLives.add("transformed the first time " + character.getSubjectPronoun().toLowerCase() + " got away with a scam. Who knew it could be so easy to make a quick dollar? Unfortunately, as a charlatan it was only a matter of time until something went south. Fleecing the wrong person has now lead to a life of avoiding ever crossing that path again");
        earlyLives.add("evolved as " + character.getSubjectPronoun().toLowerCase() + " perfected the art of flattery. It could get " + character.getObjectPronoun().toLowerCase() + " almost anything it seemed. To " + character.getObjectPronoun().toLowerCase() + " life as a charlatan is all about independence, being a free spirit with no one ordering " + character.getObjectPronoun().toLowerCase() + " around");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }
}
