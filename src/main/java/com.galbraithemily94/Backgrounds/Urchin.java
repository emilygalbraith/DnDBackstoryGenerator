package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Urchin extends Background {

    public String toString(){ return "Urchin"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String urchin1 = " was a truly hard one after a tragic accident left " + character.getObjectPronoun().toLowerCase() + " without any family or friends. ";
        String urchin2 = " Every speck of food and bit of comfort was hard to come by";
        earlyLives.add(urchin1 + urchin2);
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
