package ru.job4j.variable;

public class InfinityLoop {
    public static void main(String[] args) {
        int sum = 0;
            for (int index = 5; index < 10; index++) {
            System.out.println("infinity");
            sum = sum + index;
            System.out.println(sum);
        }
    }
}
