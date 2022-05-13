package ru.job4j.array;

import java.util.Arrays;

public class Mass {
    public static void main(String[] args) {
        int[] money = new int[12];
        for (int i = 0; i < money.length; i++) {
            money[i] = (int) (20000 + Math.random() * 10000);
            }
        System.out.println(Arrays.toString(money));
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum = sum + money[i];
            }

        System.out.println("Average = " + sum / money.length);
    }

}
