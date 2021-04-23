package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int rsl = 0;
        for (int i : data) {
            if (i == value) {
                rsl++;
            }
        }
        return rsl < data.length / 2;
    }
}
