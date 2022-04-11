package ru.job4j.variable;

public class Max {
    public static int net(int left, int right) {
        int label = left < right ? left : right;
        return label;
    }

    public static void main(String[] args) {
        int rsl = Max.net(55, 46);
        System.out.println(rsl);

        int rsl1 = Max.net(67, 15);
        System.out.println(rsl1);
    }
}
