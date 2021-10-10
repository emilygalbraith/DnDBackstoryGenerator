package com.galbraithemily94;

public class BackstoryGenerator {
    private Character character;

    public BackstoryGenerator(Character character) {
        this.character = character;
    }

    public String createBackstory(){
        characterInspection();
        //TODO create backstory "mad libs"
        String testStory = String.format("%s is a %s %s %s, who has seen %d years go by.", character.getName(), character.getGender(), character.getRaceSubType(), character.getRaceToString(), character.getAge());
        return testStory;
    }

    public void characterInspection(){
        Race race = new Race();
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
        }
        //TODO add checks for all other character attributes
    }
}