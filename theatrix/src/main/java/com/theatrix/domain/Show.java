package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Show
{

    public Show(Long id) {
        this.id = id;
    }

    public Show() {
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


    public Show(Builder build){
        this.id = build.id;
        this.showName = build.showName;
        this.startTime =build.startTime;
        this.endTime = build.endTime;
        this.MovieId = build.MovieId;

    }

    public static class Builder{
        private Long id;
        private String showName;
        private String startTime;
        private String endTime;
        private Long MovieId;

        public Builder id(long value){
            this.id = value;
            return this;
        }
        public Builder showName(String value){
            this.showName = value;
            return this;
        }
        public Builder startTime(String value){
            this.startTime = value;
            return this;
        }
        public Builder endTime(String value){
            this.endTime = value;
            return this;
        }
        public Builder MovieId(Long value){
            this.MovieId = value;
            return this;
        }
        public Show build(){
            return new Show(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Show)) return false;

        Show show = (Show) o;

        return getId().equals(show.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
