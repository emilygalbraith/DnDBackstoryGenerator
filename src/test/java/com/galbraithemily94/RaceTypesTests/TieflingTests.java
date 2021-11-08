package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.Races.Human;
import com.galbraithemily94.Races.Tiefling;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TieflingTests {
    Character testCharacter;
    Tiefling tiefling;

    @Before
    public void setUp() {
        testCharacter = new Character();
        tiefling = new Tiefling();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(tiefling);
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
        testCharacter.setRace(tiefling);
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
        testCharacter.setRace(tiefling);
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
        tiefling.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 30);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        tiefling.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 31 && age <= 50);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        tiefling.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 51 && age <= 90);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        tiefling.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 90);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> tieflingTypes = new ArrayList<>(Arrays.asList("Asmodeus", "Baalzebul", "Dispatcher", "Fierna", "Glasya", "Levistus", "Mammon", "Mephistopheles", "Zariel", "Abyssal"));
        tiefling.getRandomSubType(testCharacter);
        Assert.assertTrue(tieflingTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(tiefling.getEarlyLife(testCharacter).isEmpty());
    }
}
