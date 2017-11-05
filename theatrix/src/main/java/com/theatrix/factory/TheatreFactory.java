package com.theatrix.factory;

import com.theatrix.domain.Theatre;
import com.theatrix.utility.KeyGenerator;

/**
 * Created by aubrey on 07/08/2017.
 */
public class TheatreFactory {

    public static Theatre buildTheatre(String name,String address, String maxAdience,String minAdience,Long showId){

        Theatre theatre = new Theatre.Builder()
                .id(KeyGenerator.getEntityId())
                .name(name)
                .address(address)
                .maxAdience(maxAdience)
                .minAdience(minAdience)
                .showId(showId)
                .build();

        return theatre;
    }
}
