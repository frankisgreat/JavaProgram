package com.frank;

public class Main {

    public static void main(String[] args) {
	    // width of 16 (2 bytes)
        char myChar = '\u262f';
        System.out.println("myChar = " +  myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // find and display the copyright symbol
        char myCopyrightChar = '\u00ae';
        System.out.println("The Copyright Symbol is: " + myCopyrightChar);
    }
}
