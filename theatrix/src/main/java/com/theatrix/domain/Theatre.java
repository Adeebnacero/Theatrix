package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Kino on 2017-11-05.
 */
@Entity
public class Theatre implements Serializable
{
    public Theatre(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    private Theatre(Builder builder)
    {
        this.id = builder.IDno;
        this.name = builder.name;
        this.address = builder.address;
        this.maxAdience = builder.maxAdience;
        this.minAdience = builder.minAdience;
        this.showId = builder.showId;

    }


    public static class Builder {

        Long IDno, showId;
        private String name, address, maxAdience, minAdience;


        public Builder nameVal(String n) {
            this.name = n;
            return this;
        }

        public Builder addressVal(String val) {
            this.address = val;
            return this;
        }


        public Builder maxAdienceVal(String val) {
            this.maxAdience = val;
            return this;
        }

        public Builder minAdienceVal(String val) {
            this.minAdience = val;
            return this;
        }

        public Builder showIdVal(Long val) {
            this.showId = val;
            return this;
        }

        public Theatre build() {
            return new Theatre(this);
        }


    }


}
