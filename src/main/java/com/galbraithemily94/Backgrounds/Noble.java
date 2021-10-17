package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Noble extends Background {

    public String toString(){ return "Noble"; }

    @Override
    public String getEarlyLife() {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add("");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
