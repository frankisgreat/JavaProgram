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

        //1. Create a byte variable and set it to any valid byte number
        byte byteValue = 12;
        System.out.println("Q1: "+ byteValue);
        //2. ...short
        short shortValue = 2666;
        System.out.println("Q2:"+ shortValue);
        //3. ... int
        int intValue = 66666;
        System.out.println("Q3:"+ intValue);
        //4. Create a variable of type long and make it equeal to
        //   5000 + 10 times the sum of the sum of the byte, plus the short plus the int.
        long longValue = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("Q4:"+ longValue);
    }
}
