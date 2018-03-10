package com.frank;

public class Main {

    public static void main(String[] args) {
        System.out.println("THIIS IS A METHOD!");

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 1000, 8, 200);

    }

    //Creating Method (you can't creat method inside a method
    // Void means don't return anything
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your second final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }
}
