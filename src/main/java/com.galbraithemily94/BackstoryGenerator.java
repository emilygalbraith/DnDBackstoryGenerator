package com.galbraithemily94;

public class BackstoryGenerator {
    private Character character;

    public BackstoryGenerator(Character character) {
        this.character = character;
    }

    public String createBackstory(){
        characterInspection();
        //TODO create backstory "mad libs"
        String testStory = String.format("Name: %s || Gender: %s || Age: %d || Race: %s %s || Class: || Background: %s", character.getName(), character.getGender(), character.getAge(), character.getRaceSubType(), character.getRaceToString(), character.getBackgroundToString());
        return testStory;
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
            race.getRandomAge(character, character.getAgeRange());
        } if(character.getBackground() == null) {
            background.getRandomBackground(character, "");
        }
        //TODO add checks for all other character attributes
    }
}