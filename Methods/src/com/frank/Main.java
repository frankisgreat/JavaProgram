package com.frank;

public class Main {

    public static void main(String[] args) {
        System.out.println("THIIS IS A METHOD!");

        // calculateScore(true, 800, 5, 100);
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The Final Score is: " + highScore);
        // An Alternative approach:
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The Final Score is: " + highScore);

        // Create a method called displayHighScorePosition
        // it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
        // you should display the players name along with a message like " managed to get into position" and the
        // position they got and a further message " on the high score table",
        //
        // Create a  2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return a int
        // the return data should be
        // 1 if the score is >1000
        // 2 if the score is >500 and < 1000
        // 3 if the score is >100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
           displayHighScorePosition("Frank",800 );
    }

    public static void displayHighScorePosition (String playerName, int calculateHighScorePosition ){
        int playerPosition = calculateHighScorePosition(calculateHighScorePosition);
        System.out.println( playerName + " managed to get into position " + calculateHighScorePosition + " on the high score table.");
    }
    public static int calculateHighScorePosition( int score){

        if (score > 1000 ){

            return 1;
        }
        else if(score > 500 && score <1000){
            return 2;
        }
        else if(score >100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
    //Creating Method (you can't create method inside a method
    // Void means don't return anything
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }
}
