package ru.java.java_core;

public class Team {
     public String name;
     public int age;
     public static int power;


    public Team(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public void toString (String name, int age, int power) {
        System.out.println("Sportsmen " + name + ", age " + age + ", power " + power);
    }
}
