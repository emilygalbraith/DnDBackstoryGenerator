package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolkHero extends Background {

    public String toString(){ return "Folk Hero"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        earlyLives.add(" took a unexpected turn after an incident that allowed " + character.getPossessivePronoun().toLowerCase() + " uncommon bravery to show. A fire started in a building with people inside. While everyone stared in panic, " + character.getSubjectPronoun().toLowerCase() + " ran inside and helped the people escape, exiting the building running holding a baby. Following that " + character.getSubjectPronoun().toLowerCase() + " took every chance to bravely help the people, becoming a folk hero");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
