package ru.java.java_core;

public class Swimming extends Obstacle {
    public Swimming (int difficultly) {
        super(difficultly);
    }
    @Override
    public void goChallenge(Sportsmen member){
        member.swimm(super.getDifficulty());
    }
}
