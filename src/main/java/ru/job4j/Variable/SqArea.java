package ru.job4j.Variable;

public class SqArea {
    public static double square(double p, double k) {
        double h = p/(2*(k + 1));
        double l = h * k;
        double s = l * h;
        return s;
        }

    public static void main(String [] args) {
        double result1 = SqArea.square(9, 2);
        System.out.println("p=9, k=2, real =" + result1);
    }
}
