package ru.job4j.variable;

import java.util.Scanner;
public class Asd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость топлива");
        double fuilPrice = sc.nextDouble();
        System.out.println("Ведите расход топлива");
        int fuilR = sc.nextInt();
        System.out.println("Введите расстояние поездки = ");
        int distance = sc.nextInt();
        double totalSum;
        totalSum = fuilR / 100.0 * fuilPrice * distance * 2;
        System.out.println(totalSum);
    }
}
