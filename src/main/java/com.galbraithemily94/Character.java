package com.galbraithemily94;

import java.util.*;

public class Character {
    private int age;
    private String ageRange;
    private String gender;
    private String possessivePronoun; //his, her, their
    private String subjectPronoun; //he, she, they
    private String objectPronoun; // her, him, them
    private Race race;
    private String raceSubType;
    private String name;
    private Klass klass;
    private Background background;
    private Map<String, Boolean> familyInfo;
    private String locationFrom;
    private String currentLocation;


    //Getters
    public Race getRace() { return race; }
    public String getRaceSubType() { return raceSubType; }
    public String getRaceToString() { return race.toString(); }
    public int getAge() { return age; }
    public String getAgeRange() { return ageRange; }
    public String getGender() { return gender; }
    public String getPossessivePronoun() { return possessivePronoun; }
    public String getSubjectPronoun() { return subjectPronoun; }
    public String getObjectPronoun() { return objectPronoun; }
    public String getName() { return name; }
    public Klass getKlass() { return klass; }
    public Background getBackground() { return background; }
    public String getBackgroundToString() { return background.toString(); }

    //Setters
    public void setRace(Race race) { this.race = race; }
    public void setRaceSubType(String raceSubType) { this.raceSubType = raceSubType; }
    public void setGender(String gender) { this.gender = gender; setPronouns();}
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAgeRange(String ageRange) { this.ageRange = ageRange; }
    public void setKlass(Klass klass) { this.klass = klass; }
    public void setBackground(Background background) { this.background = background; }

    //Methods
    public void setRandomGender() {
        List<String> genders = new ArrayList<>(Arrays.asList("Male", "Female", "Non-binary"));
        Collections.shuffle(genders);
        setGender(genders.remove(0));
        setPronouns();
    }

    public void setPronouns() {
        switch (gender) {
            case "Female":
                possessivePronoun = "Her";
                subjectPronoun = "She";
                objectPronoun = "Her";
                break;
            case "Male":
                possessivePronoun = "His";
                subjectPronoun = "He";
                objectPronoun = "Him";
                break;
            case "Non-binary":
                possessivePronoun = "Their";
                subjectPronoun = "They";
                objectPronoun = "Them";
                break;
        }
    }


}
