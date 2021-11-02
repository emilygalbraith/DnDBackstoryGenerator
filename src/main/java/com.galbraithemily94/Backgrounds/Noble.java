package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Noble extends Background {

    public String toString(){ return "Noble"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add(" ended up being rather pampered after a family member's sudden rise in station");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
