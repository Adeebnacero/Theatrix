package com.theatrix.factory;

import com.theatrix.domain.Seat;
import com.theatrix.utility.KeyGenerator;

/**
 * Created by aubrey on 07/08/2017.
 */
public class SeatFactory {

    public static Seat buildSeat(String seatNumber, String seatStatus){

        Seat seat = new Seat.Builder()
                .id(KeyGenerator.getEntityId())
                .seatNumber(seatNumber)
                .seatStatus(seatStatus)
                .build();

        return seat;
    }
}
