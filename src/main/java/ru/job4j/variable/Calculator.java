package ru.job4j.variable;

public class Calculator {
        public static void delete(double first, double second) {
            double result = first / second;
        System.out.println(result);
       }

        public static void main(String[] args) {
        Calculator.delete(90, 20);
        Calculator.delete(100, 500);
        Calculator.delete(4, 2);
        Calculator.delete(3, 1);
    }
 }
