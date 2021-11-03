package com.galbraithemily94;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterTests {
    private List<String> genders = new ArrayList<>(Arrays.asList("Male", "Female", "Non-binary"));
    Character testCharacter;

    @Before
    public void setUp() {
        testCharacter = new Character();
    }

    @Test
    public void setRandomGender_ShouldReturnExpected() {
        testCharacter.setRandomGender();
        String actual = testCharacter.getGender();
        Assert.assertTrue(genders.contains(actual));
    }

    @Test
    public void setPronouns_MaleGender_ShouldReturnExpected() {
        testCharacter.setGender("Male");
        boolean isCorrect = false;
        if (testCharacter.getObjectPronoun().equals("Him") && testCharacter.getPossessivePronoun().equals("His") && testCharacter.getSubjectPronoun().equals("He")) {
            isCorrect = true;
        }
        Assert.assertTrue(isCorrect);
    }

    @Test
    public void setPronouns_FemaleGender_ShouldReturnExpected() {
        testCharacter.setGender("Female");
        boolean isCorrect = false;
        if (testCharacter.getObjectPronoun().equals("Her") && testCharacter.getPossessivePronoun().equals("Her") && testCharacter.getSubjectPronoun().equals("She")) {
            isCorrect = true;
        }
        Assert.assertTrue(isCorrect);
    }

    @Test
    public void setPronouns_NonBinaryGender_ShouldReturnExpected() {
        testCharacter.setGender("Non-binary");
        boolean isCorrect = false;
        if (testCharacter.getObjectPronoun().equals("Them") && testCharacter.getPossessivePronoun().equals("Their") && testCharacter.getSubjectPronoun().equals("They")) {
            isCorrect = true;
        }
        Assert.assertTrue(isCorrect);
    }


}
