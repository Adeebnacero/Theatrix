package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Show
{

    public Show(Long id) {
        this.id = id;
    }

    private Long id;
    private String showName;
    private String startTime;
    private String endTime;
    private Long MovieId;


    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.id = id;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setMovieId(Long movieId) {
        MovieId = movieId;
    }


    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Long getMovieId() {
        return MovieId;
    }


}
