package ru.java.java_core;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Team dinamo = new Team("Dinamo",
                new Sportsmen("Freddy", 6),
                new Sportsmen("Aleks", 10),
                new Sportsmen("Sergei", 12),
                new Sportsmen("Dmitriy" ,8));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(7),
                new Jumping(12));
        course.doIt(dinamo);
        dinamo.showResults();



    }
}