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
public class Booking implements Serializable
{

    public Booking(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long customerId;
    private Long movieId;
    private Long theatreId;
    private Long showId;
    private Long seatId;
    private String date;
    private String numCustomers;


//***************************************Setters*******************************************


    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatreId = theatreId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumCustomers(String numCustomers) {
        this.numCustomers = numCustomers;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public Long getTheatreId() {
        return theatreId;
    }

    public Long getShowId() {
        return showId;
    }

    public Long getSeatId() {
        return seatId;
    }

    public String getDate() {
        return date;
    }

    public String getNumCustomers() {
        return numCustomers;
    }



    private Booking(Builder builder)
    {
        this.id = builder.IDno;
        this.customerId = builder.custId;
        this.movieId = builder.movieId;
        this.theatreId = builder.theatreId;
        this.showId = builder.showId;
        this.seatId = builder.seatId;
        this.date = builder.date;
        this.numCustomers = builder.numCustomers;

    }


    public static class Builder {

        private Long IDno, custId, movieId, theatreId, showId, seatId;
        private String date, numCustomers;


        public Builder custIdVal(Long id) {
            this.custId = id;
            return this;
        }

        public Builder movieIdVal(Long id) {
            this.movieId = id;
            return this;
        }

        public Builder theatreIdVal(Long id) {
            this.theatreId = id;
            return this;
        }

        public Builder showIdVal(Long id) {
            this.showId = id;
            return this;
        }

        public Builder seatIdVal(Long id) {
            this.seatId = id;
            return this;
        }

        public Builder dateVal(String date) {
            this.date = date;
            return this;
        }

        public Builder numCustVal(String num) {
            this.numCustomers = num;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }



    }
