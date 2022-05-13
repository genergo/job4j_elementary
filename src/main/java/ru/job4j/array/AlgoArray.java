package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        int trem = array[1];
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[1] = array[2];
        array[2] = trem;
        array[3] = array[4];
        array[4] = temp;
        /* записываем в ячейку с индексом 3 значение временной переменной. */

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println();

        int[] array1 = new int[]{5, 3, 2, 1, 4};
        int change0 = array1[3];
        int change1 = array1[2];
        int change2 = array1[1];
        int change3 = array1[4];
        int change4 = array1[0];

        array1[0] = change0;
        array1[1] = change1;
        array1[2] = change2;
        array1[3] = change3;
        array1[4] = change4;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array1[index]);
        }
    }
}
