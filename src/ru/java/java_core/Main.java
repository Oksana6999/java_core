package ru.java.java_core;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Course course = new Course("blowToPine", 5);
        Course course1 = new Course("Huk", 8);
        Course course2 = new Course("Jag", 9);
        Course course3 = new Course("Jon", 7);
        Team team = new Team("Sergey", 25, 8);
        Team team1 = new Team("Aleksey", 33, 4);
        Team team2 = new Team("Lol", 88, 12);

        Team[] t = {team, team2, team1};
        Course[] c = {course, course1, course2, course3};
        Course.doIt(t);


    }
}