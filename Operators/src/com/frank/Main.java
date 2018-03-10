package com.frank;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        //result += 1;
        // System.out.println( " result = " + result);

        result = result - 1;
        System.out.println(previousResult + " -1 = " + result );

        previousResult = result;

        result =  result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now" + result);
        result ++;
        System.out.println("Result is now" + result);
        result --;
        System.out.println("Result is now" + result);
        result += 2;
        System.out.println("Result is now" + result);
        result *= 10;
        System.out.println("Result is now" + result);
        result -= 10;
        System.out.println("Result is now" + result);
        result /= 10;
        System.out.println("Result is now" + result);

        boolean isAlien = false;
        if (isAlien != true)
            System.out.println("It is not Alien!");

        int topScore = 80;
        if (topScore == 100)
            System.out.println("You got the high score!");
        if (topScore <= 100)
            System.out.println("You got the high score!");
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");
        // Additional operators
        // "or"
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is True!");
        boolean isCar = false;
        if (isCar == false)
            System.out.println("This is not supposed to happen!");
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        //1. Double var 20
        double myDouble1 = 20d;
        //2. Double var 80
        double myDouble2 = 80d;
        //3. Add-up and X 25
        double myDouble3 = (myDouble1 + myDouble2) * 25;
        //4. Get the remainder of #3 divided by 40
        double myRem = myDouble3 % 40;
        System.out.println("The remainder is: " + myRem);
        //5. Write if statement "Total was over the limit"
        //   if the remaining total  is equal to 20 or less.
        if (myRem <= 20)
            System.out.println("Total was over the limit");



    }
}
