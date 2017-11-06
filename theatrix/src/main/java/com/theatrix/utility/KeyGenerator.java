package com.theatrix.utility;

import java.security.SecureRandom;

/**
 * Created by aubrey on 17/08/2017.
 */
public class KeyGenerator {

    public static long getEntityId(){
        SecureRandom rand = new SecureRandom();
        long uniqueNo;

            uniqueNo = 1000 + rand.nextInt(10000);
        return uniqueNo;
    }
}
