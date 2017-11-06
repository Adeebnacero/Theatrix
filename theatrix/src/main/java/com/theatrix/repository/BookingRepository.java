package com.theatrix.repository;

import com.theatrix.domain.Booking;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 07/08/2017.
 */
public interface BookingRepository extends CrudRepository<Booking,Long> {

}
