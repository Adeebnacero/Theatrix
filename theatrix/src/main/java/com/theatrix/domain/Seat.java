package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Kino on 2017-11-05.
 */
@Entity
public class Seat implements Serializable
{

    public Seat(Long id) {
        this.seat_ID = id;
    }

    @Id
    ///@GeneratedValue(strategy = GenerationType.AUTO)
    private Long seat_ID;
    private String seatNumber;
    private String seatStatus;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.seat_ID = id;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }


    //***************************************Getters*******************************************


    public Long getId() {
        return seat_ID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatStatus() {
        return seatStatus;
    }


    private Seat(Builder builder)
    {
        this.seat_ID = builder.IDno;
        this.seatNumber = builder.seatNumber;
        this.seatStatus = builder.seatStatus;

    }


    public static class Builder {

        Long IDno;
        private String seatNumber, seatStatus;

        public Builder id(Long val) {
            this.IDno = val;
            return this;
        }

        public Builder seatNumVal(String val) {
            this.seatNumber = val;
            return this;
        }

        public Builder seatStatusVal(String val) {
            this.seatStatus = val;
            return this;
        }

        public Seat build() {
            return new Seat(this);
        }


    }



}
