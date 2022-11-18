package com.example.continents;

public class Continent {
    private String continent;
    private String emblems;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getEmblems() {
        return emblems;
    }

    public void setEmblems(String emblems) {
        this.emblems = emblems;
    }

    public Continent(String continent, String emblems) {
        this.continent = continent;
        this.emblems = emblems;
    }
}
