package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        int[] rslArray = new int[left.length + right.length];
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    rslArray[count++] = l;
                }
            }
        }
        return Arrays.copyOf(rslArray, count);
    }
}
