package com.galbraithemily94;


import com.galbraithemily94.Races.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void getRandomName_MaleDragonbornCharacter_ShouldReturnFourNames() {
        int expected = 4;
        int actual = 0;
        testCharacter.setGender("Male");
        testCharacter.setRace(dragonborn);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of four words", expected, actual);
    }

    @Test
    public void getRandomName_FemaleDragonbornCharacter_ShouldReturnFourNames() {
        int expected = 4;
        int actual = 0;
        testCharacter.setGender("Female");
        testCharacter.setRace(dragonborn);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of four words", expected, actual);
    }

    @Test
    public void getRandomName_NonBinaryDragonbornCharacter_ShouldReturnFourNames() {
        int expected = 4;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(dragonborn);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of four words", expected, actual);
    }

    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(dwarf);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of two words", expected, actual);
    }

    @Test
    public void getRandomName_FemaleDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Female");
        testCharacter.setRace(dwarf);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of two words", expected, actual);
    }

    @Test
    public void getRandomName_MaleDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Male");
        testCharacter.setRace(dwarf);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of two words", expected, actual);
    }

}


