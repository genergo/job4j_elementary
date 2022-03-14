package ru.job4j.Variable;

public class Greeting {
    public static void main(String[] args) {
        String name = "I like Java!";
        var years = 2022;
        name = name + " But I am a newbie - ";
        String idea = name + years;
        System.out.println(idea);
    }
}
