package ru.job4j.variable;

public class IfElseReturn {
    public static boolean greatThen(int first, int second) {
        boolean compare = first > second;
        return compare;
        }

    public static void main(String[] args) {
        boolean result = greatThen(10, 9);
        System.out.println(result);
    }
}
