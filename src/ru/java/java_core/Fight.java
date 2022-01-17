package ru.java.java_core;

public class Fight extends Obstacle {
    public Fight(int difficultly) {
        super(difficultly);
    }
    public void goChallenge(Sportsmen member){
        member.fight(super.getDifficulty());
    }
}
