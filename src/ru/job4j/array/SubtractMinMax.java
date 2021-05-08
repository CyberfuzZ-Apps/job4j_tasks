package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        return max - min;
    }
}
