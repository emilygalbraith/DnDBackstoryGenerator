package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.race.Gnome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GnomeTests {
    Character testCharacter;
    Gnome gnome;

    @Before
    public void setUp() {
        testCharacter = new Character();
        gnome = new Gnome();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnThreeNames() {
        int expected = 3;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(gnome);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of three words", expected, actual);
    }

    @Test
    public void getRandomName_FemaleDwarfCharacter_ShouldReturnThreeNames() {
        int expected = 3;
        int actual = 0;
        testCharacter.setGender("Female");
        testCharacter.setRace(gnome);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of three words", expected, actual);
    }

    @Test
    public void getRandomName_MaleDwarfCharacter_ShouldReturnThreeNames() {
        int expected = 3;
        int actual = 0;
        testCharacter.setGender("Male");
        testCharacter.setRace(gnome);
        testCharacter.getRace().getRandomName(testCharacter);
        String[] characterName = testCharacter.getName().split(" ");
        for(int i = 0; i < characterName.length; i++) {
            if(characterName[i].length() > 0) {
                actual++;
            }
        }
        Assert.assertEquals("Should have returned a name made up of three words", expected, actual);
    }

    @Test
    public void getRandomAge_Young_ShouldReturnIntInRange() {
        gnome.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 40);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        gnome.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 41 && age <= 200);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        gnome.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 201 && age <= 500);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        gnome.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 16 && age <= 500);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> gnomeTypes = new ArrayList<>(Arrays.asList("Forest", "Rock", "Deep"));
        gnome.getRandomSubType(testCharacter);
        Assert.assertTrue(gnomeTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(gnome.getEarlyLife(testCharacter).isEmpty());
    }
}
