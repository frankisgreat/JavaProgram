package com.frank;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less 5000 but greater than 1000");
//        } else if (score < 1000 ){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You final score was " + finalScore);
        } // Once the }, it will auto delete any variables that it creates in that code block.
          // {} <- scope

        //Print out a second score on the screen with the following
        //score set to 1000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the first printout above still display as well
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + finalScore);
        }


    }
}
