package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
                for (int i = 0; i < pref.length; i++) {
            if (word[i] == pref[i]) {
                System.out.println("совпадает");
            } else {
                System.out.println("нет совпадений");
                return false;
            }
        }
        return true;
    }
}

