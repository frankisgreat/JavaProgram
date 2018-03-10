package com.frank;

public class Main {

    public static void main(String[] args) {
	    // with of int = 32 ( 4bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 ( 4bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 ( 8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1 pound = 0.45359237 kilograms
        double myPdValue = 200d;
        double myKgValue = myPdValue * 0.45359237;
        System.out.println("myKgValue = " + myKgValue);
    }
}
