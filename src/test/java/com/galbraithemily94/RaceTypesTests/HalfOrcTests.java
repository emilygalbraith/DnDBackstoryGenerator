package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.Races.HalfOrc;
import com.galbraithemily94.Races.Halfling;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalfOrcTests {
    Character testCharacter;
    HalfOrc halfOrc;

    @Before
    public void setUp() {
        testCharacter = new Character();
        halfOrc = new HalfOrc();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(halfOrc);
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
        testCharacter.setRace(halfOrc);
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
        testCharacter.setRace(halfOrc);
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
    public void getRandomAge_Young_ShouldReturnIntInRange() {
        halfOrc.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 12 && age <= 25);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        halfOrc.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 26 && age <= 50);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        halfOrc.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 51 && age <= 75);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        halfOrc.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 12 && age <= 75);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> halfOrcTypes = new ArrayList<>(Arrays.asList("Gruumsh", ""));
        halfOrc.getRandomSubType(testCharacter);
        Assert.assertTrue(halfOrcTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(halfOrc.getEarlyLife(testCharacter).isEmpty());
    }
}
