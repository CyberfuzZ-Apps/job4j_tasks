package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int indexL = 0;
        int indexR = 0;
        while (indexL < left.length && indexR < right.length) {
            if (left[indexL] < right[indexR]) {
                rsl[count++] = left[indexL++];
            } else if (left[indexL] > right[indexR]) {
                rsl[count++] = right[indexR++];
            } else {
                rsl[count++] = left[indexL++];
                indexR++;
            }
        }
        while (indexL < left.length) {
            rsl[count++] = left[indexL++];
        }
        while (indexR < right.length) {
            rsl[count++] = right[indexR++];
        }
       return Arrays.copyOf(rsl, count);
    }
}
