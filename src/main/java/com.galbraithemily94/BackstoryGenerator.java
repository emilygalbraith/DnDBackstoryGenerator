package com.galbraithemily94;

import java.util.StringTokenizer;

public class BackstoryGenerator {
    private Character character;

    public BackstoryGenerator(Character character) {
        this.character = character;
    }

    public String createBackstory(){
        characterInspection();
        //TODO create backstory "mad libs"
        int maxLineLength = 100;
        String backstory = "";
        String characterInfo = String.format("\nName: %s || Gender: %s || Age: %d || Race: %s %s || Class: || Background: %s \n", character.getName(), character.getGender(), character.getAge(), character.getRaceSubType(), character.getRaceToString(), character.getBackgroundToString());
        String earlyLife = createEarlyChildhood();
        backstory = earlyLife;
        backstory = storyFormatter(backstory, maxLineLength);
        String prettyLine = giveMeAPrettyLine(maxLineLength);
        return characterInfo + prettyLine + backstory;
    }

    public void characterInspection(){
        Race race = new Race();
        Background background = new Background();
        if(character.getRace() == null) {
            race.getRandomCharacterRace(character, "");
            character.getRace().getRandomSubType(character);
        } if(character.getGender() == null) {
            character.setRandomGender();
        } if(character.getName() == null) {
            character.getRace().getRandomName(character);
        } if(character.getAgeRange() == null) {
            character.getRace().getRandomAge(character);
        } else {
            character.getRace().getRandomAge(character, character.getAgeRange());
        } if(character.getBackground() == null) {
            background.getRandomBackground(character, "");
        }
        //TODO add checks for all other character attributes
    }

    public String createEarlyChildhood() {
        String earlyChildhood = String.format("%s grew up %s. %s childhood %s. ", character.getName(), character.getRace().getEarlyLife(character), character.getPossessivePronoun(), character.getBackground().getEarlyLife(character));
        return earlyChildhood;
    }

    public String storyFormatter(String story, int maxLineLength) {
        StringTokenizer tokenizer = new StringTokenizer(story, " ");
        StringBuilder formatted = new StringBuilder(story.length());
        int lineLengthCounter = 0;
        while(tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if(lineLengthCounter + word.length() > maxLineLength) {
                formatted.append("\n");
                lineLengthCounter = 0;
            }
            formatted.append(word + " ");
            lineLengthCounter += word.length();
        }
        return formatted.toString();
    }

    public String giveMeAPrettyLine(int length) {
        String line = "";
        for (int i = 0; i <= length; i++){
            if(i < 8 || i > 92) {
                line += "~ ";
                continue;
            } else if (i < 12 || i > 88) {
                line += "~~ ";
                continue;
            } else if (i < 20 || i > 80) {
                line += "~~~ ";
                continue;
            }
        }
        return line + "\n";
    }


}