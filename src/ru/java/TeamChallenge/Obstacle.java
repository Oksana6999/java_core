package ru.java.TeamChallenge;

public abstract class Obstacle {

    private int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goChallenge (Sportsmen member){}
}
