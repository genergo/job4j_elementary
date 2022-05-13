package ru.job4j.array;

public class Convert {
    public static void main(String[] args) { // четные элемента масива
        int[] array = {1, 2, 3, 4, 5, 6, 8, 10};
        System.out.print("Четные элементы массива myList: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.print("\nНечетные элементы массива: "); // нечетные элементы массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }

        int[] array1 = {1, 2, 3, 4, 5, 6, 8, 10};
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (array[i] % 2 == 0) {
                System.out.print(array1[i] + ", ");
            }
        }
    }
}