package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.Races.HalfElf;
import com.galbraithemily94.Races.Halfling;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalflingTests {
    Character testCharacter;
    Halfling halfling;

    @Before
    public void setUp() {
        testCharacter = new Character();
        halfling = new Halfling();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(halfling);
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
        testCharacter.setRace(halfling);
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
        testCharacter.setRace(halfling);
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
        halfling.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 30);
    }


    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        halfling.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 31 && age <= 100);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        halfling.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 101 && age <= 150);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        halfling.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 150);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> halflingTypes = new ArrayList<>(Arrays.asList("Lightfoot", "Stout"));
        halfling.getRandomSubType(testCharacter);
        Assert.assertTrue(halflingTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(halfling.getEarlyLife(testCharacter).isEmpty());
    }
}
