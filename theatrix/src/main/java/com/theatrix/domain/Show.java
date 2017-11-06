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
public class Show implements Serializable
{

    public Show(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    private Show(Builder builder)
    {
        this.id = builder.IDno;
        this.showName = builder.showName;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.MovieId = builder.MovieId;

    }


    public static class Builder {

        private Long IDno, MovieId;
        private String showName, startTime, endTime;


        public Builder id(Long val) {
            this.IDno = val;
            return this;
        }
        public Builder showNameVal(String val) {
            this.showName = val;
            return this;
        }

        public Builder startTimeVal(String val) {
            this.startTime = val;
            return this;
        }


        public Builder endTimeVal(String val) {
            this.endTime = val;
            return this;
        }

        public Builder movieVal(Long val) {
            this.MovieId = val;
            return this;
        }
        public Show build() {
            return new Show(this);
        }


    }
}
