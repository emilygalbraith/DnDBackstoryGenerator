package com.galbraithemily94.klass;

import com.galbraithemily94.Character;
import com.galbraithemily94.klass.*;

import java.util.*;

public class Klass {
    private static final String BARBARIAN = "Barbarian";
    private static final String BARD = "Bard";
    private static final String CLERIC = "Cleric";
    private static final String DRUID = "Druid";
    private static final String FIGHTER = "Fighter";
    private static final String MONK = "Monk";
    private static final String PALADIN = "Paladin";
    private static final String RANGER = "Ranger";
    private static final String ROGUE = "Rogue";
    private static final String SORCERER = "Sorcerer";
    private static final String WARLOCK = "Warlock";
    private static final String WIZARD = "Wizard";
    private static final String[] KLASS_ARRAY = {BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROGUE, SORCERER, WARLOCK, WIZARD};

    public String[] getKlassArray() { return KLASS_ARRAY; }

    public void setKlass(Character character, String klassChoice){
        getRandomCharacterKlass(character, klassChoice);
    }

    public void getRandomCharacterKlass(Character character, String klassChoice) {
        String characterKlass;
        if(klassChoice == null || klassChoice == ""){
            List<String> klassList = new ArrayList<>(Arrays.asList(KLASS_ARRAY));
            Collections.shuffle(klassList);
            characterKlass = klassList.get(0);
        } else {
            characterKlass = klassChoice;
        }
        switch (characterKlass) {
            case BARBARIAN:
                Barbarian barbarian = new Barbarian();
                character.setKlass(barbarian);
                break;
            case BARD:
                Bard bard = new Bard();
                character.setKlass(bard);
                break;
            case CLERIC:
                Cleric cleric = new Cleric();
                character.setKlass(cleric);
                break;
            case DRUID:
                Druid druid = new Druid();
                character.setKlass(druid);
                break;
            case FIGHTER:
                Fighter fighter = new Fighter();
                character.setKlass(fighter);
                break;
            case MONK:
                Monk monk = new Monk();
                character.setKlass(monk);
                break;
            case PALADIN:
                Paladin paladin = new Paladin();
                character.setKlass(paladin);
                break;
            case RANGER:
                Ranger ranger = new Ranger();
                character.setKlass(ranger);
                break;
            case ROGUE:
                Rogue rogue = new Rogue();
                character.setKlass(rogue);
                break;
            case SORCERER:
                Sorcerer sorcerer = new Sorcerer();
                character.setKlass(sorcerer);
                break;
            case WARLOCK:
                Warlock warlock = new Warlock();
                character.setKlass(warlock);
                break;
            case WIZARD:
                Wizard wizard = new Wizard();
                character.setKlass(wizard);
                break;
        }
    }

    public String getKlassStory(Character character) { return ""; }
}
