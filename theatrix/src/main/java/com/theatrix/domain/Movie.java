package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Movie
{

    public Movie(Long id) {
        this.id = id;
    }

    private Long id;
    private String name;
    private String category;
    private String duration;
    private String yearRelease;
    private String ageRestriction;


    //***************************************Setters*******************************************


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDuration() {
        return duration;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }
}
