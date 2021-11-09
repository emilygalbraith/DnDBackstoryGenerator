package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fighter extends Klass {

    @Override
    public String toString() { return "Fighter"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String fighter1 = "";
        String fighter2 = "";
        klassStory.add(fighter1 + fighter2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }
//    Fighters learn the basics of all combat styles. Every fighter can swing an axe, fence with a rapier, wield a longsword
//    or a greatsword, use a bow, and even trap foes in a net with some degree of skill. Likewise, a fighter is adept with
//    shields and every form of armor. Beyond that basic degree of familiarity, each fighter specializes in a certain style
//    of combat. Some concentrate on archery, some on fighting with two weapons at once, and some on augmenting their
//    martial skills with magic. This combination of broad general ability and extensive specialization makes fighters
//    superior combatants on battlefields and in dungeons alike
}
