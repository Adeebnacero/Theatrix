package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Seat {

    public Seat(Long id) {
        this.id = id;
    }

    public Seat() {
    }

    private Long id;
    private String seatNumber;
    private String seatStatus;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.id = id;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }


    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public Seat(Builder build){
        this.id = build.id;
        this.seatNumber = build.seatNumber;
        this.seatStatus = build.seatStatus;
    }

    public static class Builder{

        private Long id;
        private String seatNumber;
        private String seatStatus;

        public Builder id(long value){
            this.id =value;
            return this;
        }
        public Builder seatNumber(String value){
            this.seatNumber =value;
            return this;
        }
        public Builder seatStatus(String value){
            this.seatStatus =value;
            return this;
        }
        public Seat build(){
            return new Seat(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;

        Seat seat = (Seat) o;

        return getId().equals(seat.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
