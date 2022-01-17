package ru.java.TeamChallenge;

public class Fight extends Obstacle {
    public Fight(int difficultly) {
        super(difficultly);
    }
    public void goChallenge(Sportsmen member){
        member.fight(super.getDifficulty());
    }
}
