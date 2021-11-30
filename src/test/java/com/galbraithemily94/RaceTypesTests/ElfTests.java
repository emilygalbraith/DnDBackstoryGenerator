package com.galbraithemily94.RaceTypesTests;

import com.galbraithemily94.Character;
import com.galbraithemily94.race.Elf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElfTests {
    Character testCharacter;
    Elf elf;

    @Before
    public void setUp() {
        testCharacter = new Character();
        elf = new Elf();
    }


    @Test
    public void getRandomName_NonBinaryDwarfCharacter_ShouldReturnTwoNames() {
        int expected = 2;
        int actual = 0;
        testCharacter.setGender("Non-binary");
        testCharacter.setRace(elf);
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
        testCharacter.setRace(elf);
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
        testCharacter.setRace(elf);
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
        elf.getRandomAge(testCharacter, "Young");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 60 && age <= 250);
    }

    @Test
    public void getRandomAge_MiddleAged_ShouldReturnIntInRange() {
        elf.getRandomAge(testCharacter, "Middle-Aged");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 251 && age <= 500);
    }

    @Test
    public void getRandomAge_Old_ShouldReturnIntInRange() {
        elf.getRandomAge(testCharacter, "Old");
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 501 && age <= 750);
    }

    @Test
    public void getRandomAge_ShouldReturnIntInRange() {
        elf.getRandomAge(testCharacter);
        int age = testCharacter.getAge();
        Assert.assertTrue(age >= 60 && age <= 750);
    }

    @Test
    public void getRandomSubType_ShouldReturnExpected() {
        List<String> elfTypes = new ArrayList<>(Arrays.asList("Dark Elf", "High", "Wood"));
        elf.getRandomSubType(testCharacter);
        Assert.assertTrue(elfTypes.contains(testCharacter.getRaceSubType()));
    }

    @Test
    public void getEarlyLife_ShouldReturnString() {
        Assert.assertFalse(elf.getEarlyLife(testCharacter).isEmpty());
    }
}
