package com.example.demo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String programmingLang;
    private List<String> favouriteOS;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }

    public List<String> getFavouriteOS() {
        return favouriteOS;
    }

    public void setFavouriteOS(List<String> favouriteOS) {
        this.favouriteOS = favouriteOS;
    }
}
