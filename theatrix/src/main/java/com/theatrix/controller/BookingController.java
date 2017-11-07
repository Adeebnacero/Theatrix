package com.theatrix.controller;

import com.google.gson.Gson;
import com.theatrix.domain.Booking;
import com.theatrix.service.OnlineMovie.ImplService.BookingServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kino on 2017-11-07.
 */
@Controller
@RequestMapping(path="/booking")
public class BookingController
{
    @Autowired
    private BookingServicesImpl bookingService;

    @GetMapping(path="/add/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{date}/{noSeats}")
    public @ResponseBody
    String addNewBooking(@RequestParam Long customer_ID, @RequestParam Long movie_ID, @RequestParam Long theatre_ID,
                      @RequestParam Long show_ID,  @RequestParam Long seat_ID,  @RequestParam String date,
                      @RequestParam int noSeats) {

        Booking booking = new Booking.Builder()
                .custIdVal(customer_ID)
                .movieIdVal(movie_ID)
                .theatreIdVal(theatre_ID)
                .showIdVal(show_ID)
                .seatIdVal(seat_ID)
                .dateVal(date)
                .numCustVal(noSeats)
                .build();

        bookingService.save(booking);
        return new Gson().toJson(booking);
    }


    @GetMapping(path="/add/{booking_id}/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{date}/{noSeats}")
    public @ResponseBody
    String updateBooking(@RequestParam Long booking_id, @RequestParam Long customer_ID, @RequestParam Long movie_ID,
                         @RequestParam Long theatre_ID, @RequestParam Long show_ID,  @RequestParam Long seat_ID,
                         @RequestParam String date, @RequestParam int noSeats) {

        Booking booking = new Booking.Builder()
                .id(booking_id)
                .custIdVal(customer_ID)
                .movieIdVal(movie_ID)
                .theatreIdVal(theatre_ID)
                .showIdVal(show_ID)
                .seatIdVal(seat_ID)
                .dateVal(date)
                .numCustVal(noSeats)
                .build();

        bookingService.save(booking);
        return new Gson().toJson(booking);
    }

    @GetMapping(path="/delete/{id}")
    public @ResponseBody String deleteBooking (@RequestParam Long id) {

        Booking booking = bookingService.findById(id);
        bookingService.delete(booking);

        return new Gson().toJson(booking);
    }


}
