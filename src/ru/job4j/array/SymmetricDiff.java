package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int indexL = 0;
        int indexR = 0;
        if (left.length + right.length == 1) {
            rsl[count++] = left.length == 1 ? left[indexL] : right[indexR];
        } else if (left.length == 1 && right.length == 1) {
            if (left[indexL] < right[indexR]) {
                rsl[count++] = left[0];
                rsl[count++] = right[0];
            } else if (left[indexL] > right[indexR]) {
                rsl[count++] = right[0];
                rsl[count++] = left[0];
            }
        } else {
            while (indexL < left.length && indexR < right.length) {
                if (left[indexL] == right[indexR]) {
                    indexL++;
                    indexR++;
                } else if (left[indexL] < right[indexR]) {
                    rsl[count++] = left[indexL++];
                } else if (left[indexL] > right[indexR]) {
                    rsl[count++] = right[indexR++];
                }
            }
            while (indexL < left.length) {
                rsl[count++] = left[indexL++];
            }
            while (indexR < right.length) {
                rsl[count++] = right[indexR++];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
