package ru.java.TeamChallenge;

public class Cross extends Obstacle{
    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(Sportsmen member) {
        member.run(super.getDifficulty());
    }
}
