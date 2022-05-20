package ru.job4j.array;

public class FindLoops {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static boolean indexInConteinsRan(int[] data, int el, int start, int finish) {
        boolean rst = false; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = true;
                break;
            }
        }
        return rst;
    }
}



