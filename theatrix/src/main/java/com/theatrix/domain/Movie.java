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

    public Movie(Movie.Builder build){
        this.id = build.id;
        this.name = build.name;
        this.category = build.category;
        this.duration = build.duration;
        this.yearRelease = build.yearRelease;
        this.ageRestriction = build.ageRestriction;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String category;
        private String duration;
        private String yearRelease;
        private String ageRestriction;

        public Builder id(long value) {
            this.id = value;
            return this;
        }
        public Builder name(String value) {
            this.name = value;
            return this;
        }
        public Builder category(String value) {
            this.category = value;
            return this;
        }
        public Builder duration(String value) {
            this.duration = value;
            return this;
        }
        public Builder yearRelease(String value) {
            this.yearRelease = value;
            return this;
        }
        public Builder ageRestriction(String value) {
            this.ageRestriction = value;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        return getId().equals(movie.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
