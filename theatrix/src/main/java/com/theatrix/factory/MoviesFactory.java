package com.theatrix.factory;

import com.theatrix.domain.Movie;
import com.theatrix.utility.KeyGenerator;

/**
 * Created by aubrey on 07/08/2017.
 */
public class MoviesFactory {

    public static Movie buildMovies(String name, String category, String duration,String yearRelease,String ageRestriction){

       Movie movies = new Movie.Builder()
               .id(KeyGenerator.getEntityId())
               .name(name)
               .category(category)
               .duration(duration)
               .yearRelease(yearRelease)
               .ageRestriction(ageRestriction)
               .build();

       return movies;
    }

    /*public static Medicine updateMedicine(long medicineID, String medicineName, double medicinePrice,int quantity, String medicineDetails){

        Medicine medicine = new Medicine.Builder()
                .medicineId(medicineID)
                .medicineName(medicineName)
                .medicinePrice(medicinePrice)
                .quantity(quantity)
                .details(medicineDetails)
                .build();

        return medicine;
    }*/
}
