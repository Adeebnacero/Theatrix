package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Seat {

    public Seat(Long id) {
        this.id = id;
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


}
