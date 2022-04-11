package ru.job4j.variable;

public class Game {
        public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
           System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
           }
    }

    public static void main(String[] args) {
        Game.permission(true, true);
        Game.permission(true, false);
        Game.permission(false, true);
        Game.permission(false, false);
    }
    }
