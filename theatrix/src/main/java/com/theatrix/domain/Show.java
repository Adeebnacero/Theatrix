package com.theatrix.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Kino on 2017-11-05.
 */
@Entity
public class Show implements Serializable
{

    public Show(Long id) {
        this.show_ID = id;
    }

    public Show() {
    }

    @Id
   /// @GeneratedValue(strategy = GenerationType.AUTO)
    private Long show_ID;
    private String showName;
    private String startTime;
    private String endTime;
    private Long movie_ID;

    @Column(name ="movie_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Movie> movieSet;

    //***************************************Setters*******************************************

    public void setId(Long show_ID) {
        this.show_ID = show_ID;
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
        movie_ID = movieId;
    }


    //***************************************Getters*******************************************


    public Long getId() {
        return show_ID;
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
        return movie_ID;
    }


    private Show(Builder builder)
    {
        this.show_ID = builder.IDno;
        this.showName = builder.showName;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.movie_ID = builder.MovieId;

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
