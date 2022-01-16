package ru.java.java_core;

public class Course {
    public static String name;
    public static int difficult;

    public Course(String name, int difficult) {
        this.name = name;
        this.difficult = difficult;
    }

    public static void doIt(Team[] team) {
        if (difficult < team.power) {
            System.out.println("Sportsmen " + name + " is win.");
        }
        if (difficult > team.power) {
            System.out.println("Sportsmen " + name + " is lose.");
        }
    }
}