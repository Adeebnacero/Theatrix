package com.theatrix.factory;

import com.theatrix.domain.Booking;
import com.theatrix.utility.KeyGenerator;

/**
 * Created by aubrey on 09/09/2017.
 */
public class BookingsFactory {

    public static Booking buildBookings(Long customerId, Long movieId, Long theatreId, Long showId
    , Long seatId, String date, String numCustomers){

        Booking booking = new Booking.Builder()
                .id(KeyGenerator.getEntityId())
                .customerId(customerId)
                .movieId(movieId)
                .theatreId(theatreId)
                .showId(showId)
                .seatId(seatId)
                .date(date)
                .numCustomers(numCustomers)
                .build();

        return booking;
    }
}
