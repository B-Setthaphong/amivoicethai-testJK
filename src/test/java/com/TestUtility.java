package com;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import amivoiceThai.MyData;

public class TestUtility {  

    @Test
    public void getNumber_5() {
        Random stubRandom = new Random5();
        MyData myData = new MyData();
        myData.setRandom(stubRandom);
        int actualResult = myData.getNumber();
        assertEquals(5, actualResult);
    } 
 
}
class Randomxxx extends Random {
    boolean called = false;
    @Override
    public int nextInt(int bound) {
        called = true;
        return 5;
    }

    public boolean verify() {
        return called;
    }
}
class Random5 extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}
