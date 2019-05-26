package com.jaesma;

public class Player {

    private String name;
    private int guessNumber;
    private boolean isRight;

    public Player(String name) {
        this.name = name;
        isRight = false;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public String getName() {
        return name;
    }


    public void guess() {
        guessNumber = (int) (Math.random() * 10 + 1);
        System.out.println(this.name + " guessed " + guessNumber);
    }


}
