package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Theatre
{
    public Theatre(Long id) {
        this.id = id;
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
}
