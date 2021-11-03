package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.Races.Dragonborn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DragonbornTests {
    Character testCharacter;
    Dragonborn dragonborn;

    @Before
    public void setUp() {
        testCharacter = new Character();
        dragonborn = new Dragonborn();
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
    public void getRandomAge_Young_ShouldReturnIntInRange() {
        dragonborn.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 6 && age <= 30);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        dragonborn.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 31 && age <= 50);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        dragonborn.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 51 && age <= 80);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        dragonborn.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 6 && age <= 80);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> draconicAncestryList = new ArrayList<>(Arrays.asList("Black", "Blue", "Brass", "Bronze", "Copper", "Gold", "Green", "Red", "Silver", "White"));
        dragonborn.getRandomSubType(testCharacter);
        Assert.assertTrue(draconicAncestryList.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(dragonborn.getEarlyLife(testCharacter).isEmpty());
    }
}


