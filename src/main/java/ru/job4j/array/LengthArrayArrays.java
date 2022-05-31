package ru.job4j.array;

public class LengthArrayArrays {
      public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
        System.out.println();
        int[][] number = {{1}, {4, 5}, {7, 8, 9}, {10, 11, 12, 13}};
        for (int i = 0; i < number.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + number[i].length);
        }
        System.out.println();

        int[] even = new int[10];
        for (int i = 0; i < 10; i++) {
            even[i] = i * 2 + 2; //вывод четных чисел массива если 2, если 1 то нечетных
        }
        for (int data : even) {
            System.out.println(data);
        }
    }
}
