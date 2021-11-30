package com.galbraithemily94;


import com.galbraithemily94.race.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceTests {
    private Character testCharacter;
    private Race testRace;
    private Dragonborn dragonborn;
    private Dwarf dwarf;
    private Elf elf;
    private Gnome gnome;
    private HalfElf halfElf;
    private Halfling halfling;
    private HalfOrc halfOrc;
    private Human human;
    private Tiefling tiefling;


    @Before
    public void setUp() {
        testCharacter = new Character();
        testRace = new Race();
        dragonborn = new Dragonborn();
        dwarf = new Dwarf();
        elf = new Elf();
        gnome = new Gnome();
        halfElf = new HalfElf();
        halfling = new Halfling();
        halfOrc = new HalfOrc();
        human = new Human();
        tiefling = new Tiefling();
    }

    @Test
    public void setRace_ShouldSetExpectedRace() {
        List<Race> raceList = new ArrayList<>(Arrays.asList(dragonborn, dwarf, elf, gnome, halfElf, halfling, halfOrc, human, tiefling));
        int expected = 9;
        int actual = 0;
        for(Race race : raceList) {
            testRace.setRace(testCharacter, race.toString());
            if(testCharacter.getRace().getClass().equals(race.getClass())) {
                actual++;
            }
        }
        Assert.assertEquals("Failed to set all 9 races", expected, actual);
    }

    @Test
    public void getRandomCharacterRace_GivenEmptyString_ShouldReturnRace() {
        testRace.getRandomCharacterRace(testCharacter, "");
        Assert.assertNotNull(testCharacter.getRace());
    }




}


