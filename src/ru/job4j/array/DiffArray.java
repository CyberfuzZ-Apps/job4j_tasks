package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int count = 0;
        if (right.length != 0) {
            for (int l : left) {
                for (int r : right) {
                    if (l != r) {
                        rsl[count++] = l;
                    } else {
                        break;
                    }
                }
            }
        } else {
            rsl = Arrays.copyOf(left, left.length);
            count = left.length;
        }
        return Arrays.copyOf(rsl, count);
    }
}
