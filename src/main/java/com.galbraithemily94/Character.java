package com.galbraithemily94;

import java.util.Map;

public class Character {
    private int age;
    private String race;
    private String name;
    private String klass;
    private String background;
    private Map<String, Boolean> familyInfo;
    private String locationFrom;
    private String currentLocation;

    public String getRace() { return race; }
    public int getAge() { return age; }
    public void setRace(String race) { this.race = race; }
    public void setAge(int age) { this.age = age;}

}
