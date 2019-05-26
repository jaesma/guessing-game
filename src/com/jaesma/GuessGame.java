package com.jaesma;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
         p1 = new Player("Player 1");
         p2 = new Player("Player 2");
         p3 = new Player("Player 3");


        int targetNumber = (int) (Math.random() * 10 + 1);

        System.out.println("Let's play a guessing game!");
        System.out.println("I'm thinking of a numbewr between 1 and 10...");

        while (true) {
            System.out.println("The number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.getGuessNumber() == targetNumber) {
                p1.setRight(true);
            }
            if (p2.getGuessNumber() == targetNumber) {
                p2.setRight(true);
            }
            if (p3.getGuessNumber() == targetNumber) {
                p3.setRight(true);
            }

            if (p1.isRight() || p2.isRight() || p3.isRight()) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1.isRight());
                System.out.println("Player two got it right? " + p2.isRight());
                System.out.println("Player three got it right? " + p3.isRight());
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
