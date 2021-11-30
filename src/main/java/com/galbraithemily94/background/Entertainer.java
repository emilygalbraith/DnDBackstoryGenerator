package com.galbraithemily94.background;

import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entertainer extends Background {

    public String toString(){ return "Entertainer"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        if(character.getGender() == null) {
            character.setRandomGender();
        }
        earlyLives.add("ended up being shaped by " + character.getPossessivePronoun().toLowerCase() + " love of entertaining. It felt good to see joy on a crowd of faces. While " + character.getSubjectPronoun().toLowerCase() + " could do many things, " + character.getSubjectPronoun().toLowerCase() + " became known as an accomplished singer");
        earlyLives.add("was inspired one night after seeing a poet performing in the square and receiving the rapt attention and adoration of a crowd. " +  character.getSubjectPronoun() + " wanted just that and started writing that night. The first poems were received with mockery. However, in time " + character.getPossessivePronoun().toLowerCase() + " poems rivaled the greatest");
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
