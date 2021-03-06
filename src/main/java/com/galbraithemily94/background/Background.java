package com.galbraithemily94.background;

import com.galbraithemily94.Character;
import com.galbraithemily94.background.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Background {
    private static final String ACOLYTE = "Acolyte";
    private static final String CHARLATAN = "Charlatan";
    private static final String CRIMINAL = "Criminal";
    private static final String ENTERTAINER = "Entertainer";
    private static final String FOLK_HERO = "Folk Hero";
    private static final String GLADIATOR = "Gladiator";
    private static final String GUILD_ARTISAN = "Guild Artisan";
    private static final String HERMIT = "Hermit";
    private static final String KNIGHT = "Knight";
    private static final String NOBLE = "Noble";
    private static final String OUTLANDER = "Outlander";
    private static final String PIRATE = "Pirate";
    private static final String SAGE = "Sage";
    private static final String SAILOR = "Sailor";
    private static final String SOLDIER = "Soldier";
    private static final String URCHIN = "Urchin";
    private static final String[] BACKGROUND_ARRAY = {ACOLYTE, CHARLATAN, CRIMINAL, ENTERTAINER, FOLK_HERO, GLADIATOR, GUILD_ARTISAN, HERMIT, KNIGHT, NOBLE,OUTLANDER, PIRATE, SAGE, SAILOR, SOLDIER, URCHIN};
    private static final List<String> BACKGROUND_LIST = new ArrayList<>(Arrays.asList(BACKGROUND_ARRAY));
    //For character sheet
    private List<String> skillProficiencies;
    private List<String> languages;

    public String[] getBackgroundArray() { return BACKGROUND_ARRAY;}

    public void setCharacterBackground(Character character, String backgroundChoice){
        getRandomBackground(character, backgroundChoice);
    }

    public void getRandomBackground(Character character, String backgroundChoice) {
        String characterBackground;
        if(backgroundChoice == null || backgroundChoice == ""){
            Collections.shuffle(BACKGROUND_LIST);
            characterBackground = BACKGROUND_LIST.get(0);
        } else {
            characterBackground = backgroundChoice;
        }
        switch (characterBackground) {
            case ACOLYTE:
                Acolyte acolyte = new Acolyte();
                character.setBackground(acolyte);
                break;
            case CHARLATAN:
                Charlatan charlatan = new Charlatan();
                character.setBackground(charlatan);
                break;
            case CRIMINAL:
                Criminal criminal = new Criminal();
                character.setBackground(criminal);
                break;
            case ENTERTAINER:
                Entertainer entertainer = new Entertainer();
                character.setBackground(entertainer);
                break;
            case FOLK_HERO:
                FolkHero folkHero = new FolkHero();
                character.setBackground(folkHero);
                break;
            case GLADIATOR:
                Gladiator gladiator = new Gladiator();
                character.setBackground(gladiator);
                break;
            case GUILD_ARTISAN:
                GuildArtisan guildArtisan = new GuildArtisan();
                character.setBackground(guildArtisan);
                break;
            case HERMIT:
                Hermit hermit = new Hermit();
                character.setBackground(hermit);
                break;
            case KNIGHT:
                Knight knight = new Knight();
                character.setBackground(knight);
                break;
            case NOBLE:
                Noble noble = new Noble();
                character.setBackground(noble);
                break;
            case OUTLANDER:
                Outlander outlander = new Outlander();
                character.setBackground(outlander);
                break;
            case PIRATE:
                Pirate pirate = new Pirate();
                character.setBackground(pirate);
                break;
            case SAGE:
                Sage sage = new Sage();
                character.setBackground(sage);
                break;
            case SAILOR:
                Sailor sailor = new Sailor();
                character.setBackground(sailor);
                break;
            case SOLDIER:
                Soldier soldier = new Soldier();
                character.setBackground(soldier);
                break;
            case URCHIN:
                Urchin urchin = new Urchin();
                character.setBackground(urchin);
                break;
        }
    }

    public String getEarlyLife(Character character) { return ""; }

}
