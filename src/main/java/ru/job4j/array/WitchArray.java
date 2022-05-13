package ru.job4j.array;

public class WitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int source = array[1];
        int dest = array[3];
        array[1] = dest;
        array[3] = source;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}