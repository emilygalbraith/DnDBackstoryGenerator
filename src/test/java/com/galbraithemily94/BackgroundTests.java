package com.galbraithemily94;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackgroundTests {
    Background testBackground;
    Character testCharacter;
    String[] testBackgroundArray = {"Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Gladiator", "Guild Artisan", "Hermit", "Knight", "Noble", "Outlander", "Pirate", "Sage", "Sailor", "Soldier", "Urchin"};

    @Before
    public void setUp() {
        testBackground = new Background();
        testCharacter = new Character();
    }

    @Test
    public void getBackgroundArray_ShouldReturnExpected() {
        String[] expected = testBackgroundArray;
        String[] actual = testBackground.getBackgroundArray();
        Assert.assertArrayEquals("Array did not contain expected values", expected, actual);
    }

    @Test
    public void setCharacterBackground_ShouldSetExpectedBackground() {
        int expected = 16;
        int actual = 0;
        String[] backgroundArray = testBackground.getBackgroundArray();
        for (int i = 0; i < testBackgroundArray.length; i++){
            testBackground.setCharacterBackground(testCharacter, testBackgroundArray[i]);
            if (testCharacter.getBackgroundToString().equals(testBackgroundArray[i])) {
                actual++;
            }
        }
        Assert.assertEquals("Background should be what was set", expected, actual);
    }

    @Test
    public void getRandomBackground_NullValue_ShouldReturnValidData() {
        testBackground.getRandomBackground(testCharacter, null);
        Assert.assertFalse(testCharacter.getBackgroundToString().isEmpty());
    }

//    @Test
//    public void getEarlyLife_ShouldReturnString() {
//        String[] backgroundArray = {"Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Gladiator", "Guild Artisan", "Hermit", "Knight", "Noble", "Outlander", "Pirate", "Sage", "Sailor", "Soldier", "Urchin"};
//        int expected = 16;
//        int actual = 0;
//        for(String background : backgroundArray) {
//            testBackground.getRandomBackground(testCharacter, background);
//            if(testCharacter.getBackground().getEarlyLife(testCharacter).length() > 0) {
//                actual++;
//            }
//        }
//        Assert.assertEquals(expected, actual);
//    }

}
