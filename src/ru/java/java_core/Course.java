package ru.java.java_core;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Sportsmen member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }
}