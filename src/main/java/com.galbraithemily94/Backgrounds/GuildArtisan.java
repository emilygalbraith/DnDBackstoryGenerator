package com.galbraithemily94.Backgrounds;

import com.galbraithemily94.Background;
import com.galbraithemily94.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuildArtisan extends Background {

    public String toString(){ return "Guild Artisan"; }

    @Override
    public String getEarlyLife(Character character) {
        List<String> earlyLives = new ArrayList<>();
        String guildArtisan1 = "became dedicated to a apprenticeship in the renowned ";
        String guildArtisan2 = character.getSubjectPronoun().toLowerCase() + " became a Master in " + character.getPossessivePronoun().toLowerCase() + " own right";
        earlyLives.add(guildArtisan1 + "Guild of Smiths and Metal-Forgers. After many days spent labouring under Raibeart, " + guildArtisan2);
        earlyLives.add(guildArtisan1 + "Guild of Shipwrights and Sailmakers. After many days spent labouring under Kotashi, " + guildArtisan2);
        earlyLives.add(guildArtisan1 + "Guild of Masons and Stonecutters. After many days spent labouring under Valrien, " + guildArtisan2);
        earlyLives.add(guildArtisan1 + "Guild of Calligraphers, Scribes, and Scriveners. After many days spent labouring under Raibeart, " + guildArtisan2);
        Collections.shuffle(earlyLives);
        return earlyLives.get(0);
    }

}
