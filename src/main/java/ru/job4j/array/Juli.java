package ru.job4j.array;

public class Juli {
    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 2;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}