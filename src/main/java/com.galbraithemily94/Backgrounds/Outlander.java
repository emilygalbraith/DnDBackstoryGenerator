package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Outlander extends Background {

    public String toString(){ return "Outlander"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}