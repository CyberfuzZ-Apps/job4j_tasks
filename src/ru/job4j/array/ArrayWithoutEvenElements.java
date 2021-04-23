package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int index = 0;
        int[] rslArray = new int[data.length];
        for (int i: data) {
            if (i % 2 != 0) {
                rslArray[index++] = i;
            }
        }
        return Arrays.copyOf(rslArray, index);
    }
}
