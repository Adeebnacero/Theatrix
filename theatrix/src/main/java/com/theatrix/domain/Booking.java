package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Booking
{

    public Booking(Long id) {
        this.id = id;
    }

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


}
