package ru.job4j.variable;

public class Out {
    public static void main(String[] args) {
        String lyrics = "Мама мыла раму";
        System.out.println(lyrics);
        String name = "Petr";
        byte age = 33;
        String surname = ("Ivanov, " + age + " года ");
        String separate = " - ";
        String id = name + separate + surname;
        System.out.println(id);
    }
}
