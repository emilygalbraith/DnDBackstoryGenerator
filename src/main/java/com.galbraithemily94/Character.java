package com.galbraithemily94;

import java.util.*;

public class Character {
    private int age;
    private String gender;
    private Race race;
    private String raceSubType;
    private String name;
    private String klass;
    private String background;
    private Map<String, Boolean> familyInfo;
    private String locationFrom;
    private String currentLocation;

    //Getters
    public Race getRace() { return race; }
    public String getRaceSubType() { return raceSubType; }
    public String getRaceToString() { return race.toString(); }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getName() { return name; }

    //Setters
    public void setRace(Race race) { this.race = race; }
    public void setRaceSubType(String raceSubType) { this.raceSubType = raceSubType; }
    public void setAge(int age) { this.age = age;}
    public void setGender(String gender) { this.gender = gender; }
    public void setName(String name) { this.name = name; }

    //Methods
    public void setRandomGender() {
        List<String> genders = new ArrayList<>(Arrays.asList("Male", "Female", "Non-binary"));
        Collections.shuffle(genders);
        setGender(genders.remove(0));
    }

}
