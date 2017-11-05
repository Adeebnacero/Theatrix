package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Theatre
{
    public Theatre(Long id) {
        this.id = id;
    }

    public Theatre() {
    }

    private Long id;
    private String name;
    private String address;
    private String maxAdience;
    private String minAdience;
    private Long showId;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaxAdience(String maxAdience) {
        this.maxAdience = maxAdience;
    }

    public void setMinAdience(String minAdience) {
        this.minAdience = minAdience;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }


    //***************************************Getters*******************************************

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMaxAdience() {
        return maxAdience;
    }

    public String getMinAdience() {
        return minAdience;
    }

    public Long getShowId() {
        return showId;
    }

    public Theatre(Builder build){

        this.id = build.id;
        this.name = build.name;
        this.address = build.address;
        this.maxAdience = build.maxAdience;
        this.minAdience = build.minAdience;
        this.showId = build.showId;
    }


    public static class Builder{

        private Long id;
        private String name;
        private String address;
        private String maxAdience;
        private String minAdience;
        private Long showId;

        public Builder id(long value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder address(String value){
            this.address = value;
            return this;
        }
        public Builder maxAdience(String value){
            this.maxAdience = value;
            return this;
        }
        public Builder minAdience(String value){
            this.minAdience = value;
            return this;
        }
        public Builder showId(Long value){
            this.showId = value;
            return this;
        }
        public Theatre build(){
            return new Theatre(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Theatre)) return false;

        Theatre theatre = (Theatre) o;

        return getId().equals(theatre.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
