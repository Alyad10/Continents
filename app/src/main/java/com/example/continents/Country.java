package com.example.continents;

public class Country {
    private String country;
    private String flags;

    public Country(String country, String flags) {
        this.country = country;
        this.flags = flags;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }
}
