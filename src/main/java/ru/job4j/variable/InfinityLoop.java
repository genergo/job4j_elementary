package ru.job4j.variable;

public class InfinityLoop {
    public static void main(String[] args) {
            for (int index = 5; index < 10; index++) {
            System.out.println("infinity");
            index = index - 1;
        }
    }
}
