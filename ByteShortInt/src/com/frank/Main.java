package com.frank;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //int has a width of 32.
        int myMinValue = -2147483648;
        int myMaxValue = (2147483647/2);

        //byte has a width of 8.
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);//casting
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16.
        short myShortValue = -3000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);
        //long has a width of 64.
        long myLongValue = 100L;
    }
}
