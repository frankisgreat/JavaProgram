package com.frank;

public class Main {

    public static void main(String[] args) {
	    //primitive data type:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
      String myString = "This is a string.";
        System.out.println("myString = " + myString);
        myString = myString + " and this is more.";
        System.out.println("myString = " + myString);
        myString = myString +"\u00a9 2018";
        System.out.println("myString = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString = " + numberString);//treat as text only!

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);// convert int to string since left side defined as string

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(" LasString = " + lastString);

   }
}
