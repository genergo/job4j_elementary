package ru.job4j.array;

import java.util.Arrays;

public class Fil {
    public static int[] black(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
        array[i] = array.length - i - 1;
        array[array.length - i - 1] = temp;
       }
          return array;
    }

    public static void main(String[] args) {
        int[] trem = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] rsl = black(trem);
        System.out.println(Arrays.toString(rsl));
        }
}
