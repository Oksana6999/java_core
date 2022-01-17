package ru.java.TeamChallenge;

public class Jumping extends Obstacle {
    public Jumping(int difficultly){
        super(difficultly);
    }

    @Override
    public void goChallenge(Sportsmen member) {
        member.jump(super.getDifficulty());
    }
}
