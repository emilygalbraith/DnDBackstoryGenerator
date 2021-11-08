package com.galbraithemily94;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

public class BackstoryGeneratorTests {
    BackstoryGenerator backstoryGenerator;
    Character testCharacter;

    @Before
    public void setUp(){
        testCharacter = new Character();
        backstoryGenerator = new BackstoryGenerator(testCharacter);
    }

    @Test
    public void giveMeAPrettyLine_ShouldReturnExpectedFormattedLine(){
        String expected = "~ ~ ~ ~ ~ ~ ~ ~ ~~ ~~ ~~ ~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~ ~~ ~~ ~~ ~ ~ ~ ~ ~ ~ ~ ~ \n";
        int maxLineLength = 100;
        String actual = backstoryGenerator.giveMeAPrettyLine(maxLineLength);
        Assert.assertEquals("Pretty Line Was Not As Expected", expected, actual);

    }

    @Test
    public void storyFormatter_ShouldReturnLinesFormattedToMaxLength(){
        boolean isFormatted = false;
        int maxLineLength = 100;
        int expected = maxLineLength;
        int actual = 0;
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String resultString = backstoryGenerator.storyFormatter(testString, maxLineLength);
        String[] testStringArray = resultString.split("\n");
        resultString = testStringArray[0];
        actual = resultString.length();
        Assert.assertEquals("The string was not formatted to the correct line length", expected, actual);
    }

    @Test
    public void createEarlyChildhood_ShouldReturnExpected(){
        String testEarlyChildhood = backstoryGenerator.createEarlyChildhood();
        boolean containsGrewUp = testEarlyChildhood.contains("grew up");
        boolean containsChildhood = testEarlyChildhood.contains("childhood");
        Assert.assertTrue(containsGrewUp);
        Assert.assertTrue("Did not return a string with expected words", containsChildhood);
    }

    @Test
    public void characterInspection_ShouldReturnACharacterWithNoNullVariables(){
        boolean isCharacterInspected = false;
        backstoryGenerator.characterInspection();
        boolean hasRace = testCharacter.getRace() != null;
        boolean hasRaceSubType = testCharacter.getRaceSubType() != null;
        boolean hasGender = testCharacter.getGender() != null;
        boolean hasName = testCharacter.getName() != null;
        boolean hasAge = testCharacter.getAge() > 0;
        boolean hasBackground = testCharacter.getBackground() != null;
        isCharacterInspected = hasRace && hasRaceSubType && hasGender && hasName && hasAge && hasBackground;
        Assert.assertTrue("A variable in character was still null" ,isCharacterInspected);
    }

    @Test
    public void createBackstory_ShouldReturnExpected(){
        String testString = backstoryGenerator.createBackstory();
        boolean containsExpectedStrings = false;
        boolean containsName = testString.contains("Name:");
        boolean containsGender = testString.contains("Gender:");
        boolean containsAge = testString.contains("Age:");
        boolean containsRace = testString.contains("Race:");
        boolean containsClass = testString.contains("Class:");
        boolean containsBackground = testString.contains("||");
        containsExpectedStrings = containsName && containsGender && containsAge && containsRace && containsClass && containsBackground;
        Assert.assertTrue("Did not contain expected strings", containsExpectedStrings);
    }
}
