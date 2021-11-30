package com.galbraithemily94;

import com.galbraithemily94.klass.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KlassTests {
    private Character testCharacter;
    private Klass testKlass;
    private Barbarian barbarian;
    private Bard bard;
    private Cleric cleric;
    private Druid druid;
    private Fighter fighter;
    private Monk monk;
    private Paladin paladin;
    private Ranger ranger;
    private Rogue rogue;
    private Sorcerer sorcerer;
    private Warlock warlock;
    private Wizard wizard;
    String[] klassArray = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    @Before
    public void setUp(){
        testCharacter = new Character();
        testKlass = new Klass();
        barbarian = new Barbarian();
        bard = new Bard();
        cleric = new Cleric();
        druid = new Druid();
        fighter = new Fighter();
        monk = new Monk();
        paladin = new Paladin();
        ranger = new Ranger();
        rogue = new Rogue();
        sorcerer = new Sorcerer();
        warlock = new Warlock();
        wizard = new Wizard();
    }

    @Test
    public void setKlass_ShouldSetExpectedKlass(){
        List<Klass> klassList = new ArrayList<>(Arrays.asList(barbarian, bard, cleric, druid, fighter, monk, paladin, ranger, rogue, sorcerer, warlock, wizard));
        int expected = 12;
        int actual = 0;
        for(Klass klass: klassList){
            testKlass.setKlass(testCharacter, klass.toString());
            if(testCharacter.getKlass().getClass().equals(klass.getClass())) {
                actual++;
            }
        }
        Assert.assertEquals("Failed to set all 12 races", expected, actual);
    }

    @Test
    public void getRandomCharacterKlass_GivenEmptyString_ShouldReturnKlass() {
        testKlass.getRandomCharacterKlass(testCharacter, "");
        Assert.assertNotNull(testCharacter.getKlass());
    }

    @Test
    public void getRandomKlass_NullValue_ShouldReturnValidData() {
        testKlass.getRandomCharacterKlass(testCharacter, null);
        Assert.assertFalse(testCharacter.getKlassToString().isEmpty());
    }

    @Test
    public void getKlassStory_ShouldReturnString() {
        int expected = 12;
        int actual = 0;
        for(String klass : klassArray) {
            testKlass.getRandomCharacterKlass(testCharacter, klass);
            if(testCharacter.getKlass().getKlassStory(testCharacter).length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKlassArray_ShouldReturnExpected() {
        String[] expected = klassArray;
        String[] actual = testKlass.getKlassArray();
        Assert.assertArrayEquals("Array did not contain expected values", expected, actual);
    }

}
