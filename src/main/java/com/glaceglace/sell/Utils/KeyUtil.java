package com.glaceglace.sell.Utils;

import java.util.Random;

public class KeyUtil {

    /**
     * generate unique primary key
     * format = current time + random number
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random  = new Random();


        Integer a = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+ String.valueOf(a);
    }
}
