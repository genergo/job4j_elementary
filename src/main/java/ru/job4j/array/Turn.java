package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }


    public static int[] black(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
                    }
        return array;
    }

    public static void main(String[] args) {
        int[] trem = new int[]{0, 1, 2, 3, 4};
        int[] dream = new int[]{1, 2, 3, 4, 5};
        int[] rsl = black(trem);
        System.out.println(Arrays.toString(rsl));
        int[] result = back(dream);
        System.out.println(Arrays.toString(result));
    }
}

