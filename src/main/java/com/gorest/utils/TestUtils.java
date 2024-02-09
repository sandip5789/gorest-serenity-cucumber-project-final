package com.gorest.utils;

import java.util.Random;

public class TestUtils {
    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);                  //Returns String
        return Integer.toString(randomInt);
    }

    public static int getRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(10000);                    //Returns int
        return number;
    }
}
