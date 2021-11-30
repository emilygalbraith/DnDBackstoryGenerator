package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.race.Human;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanTests {
    Character testCharacter;
    Human human;

    @Before
    public void setUp() {
        testCharacter = new Character();
        human = new Human();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(human);
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
        testCharacter.setRace(human);
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
        testCharacter.setRace(human);
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
        human.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 30);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        human.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 31 && age <= 50);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        human.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 51 && age <= 80);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        human.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 80);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> humanTypes = new ArrayList<>(Arrays.asList(""));
        human.getRandomSubType(testCharacter);
        Assert.assertTrue(humanTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(human.getEarlyLife(testCharacter).isEmpty());
    }
}
