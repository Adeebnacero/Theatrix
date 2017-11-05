package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Booking
{

    public Booking(Long id) {
        this.id = id;
    }

    public Booking() {
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

    public Booking(Booking.Builder build){
        this.id = build.id;
        this.customerId = build.customerId;
        this.movieId = build.movieId;
        this.theatreId = build.theatreId;
        this.showId = build.showId;
        this.seatId = build.seatId;
        this.date = build.date;
        this.numCustomers = build.numCustomers;
    }

    public static class Builder{
        private Long id;
        private Long customerId;
        private Long movieId;
        private Long theatreId;
        private Long showId;
        private Long seatId;
        private String date;
        private String numCustomers;

        public Builder id(long value){
            this.id = value;
            return this;
        }
        public Builder customerId(long value){
            this.customerId = value;
            return this;
        }
        public Builder movieId(long value){
            this.movieId = value;
            return this;
        }
        public Builder theatreId(long value){
            this.theatreId = value;
            return this;
        }
        public Builder showId(long value){
            this.showId = value;
            return this;
        }
        public Builder seatId(long value){
            this.seatId = value;
            return this;
        }
        public Builder date(String value){
            this.date = value;
            return this;
        }
        public Builder numCustomers(String value){
            this.numCustomers = value;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;

        Booking booking = (Booking) o;

        return getId().equals(booking.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
