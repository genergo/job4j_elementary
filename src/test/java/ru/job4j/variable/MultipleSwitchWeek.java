package ru.job4j.variable;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Thuesday" -> 2;
            case "Седа", "wednesday" -> 3;
            case "Четверг", "thursday" -> 4;
            case "Пятница", "friday" -> 5;
            case "Суббота", "saturday" -> 6;
            case "Воскресень", "sunday" -> 7;
            default -> -1;
        };

    }
}