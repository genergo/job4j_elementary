package ru.job4j.variable;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
        }

    public static void main(String[] args) {
        double result1 = SqArea.square(12, 2);
        System.out.println("p=8, k=2, real =" + result1);
    }
}
