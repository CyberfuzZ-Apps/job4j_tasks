package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + middle.length / 2 + right.length / 2];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 1; i < result.length - 1; i++) {
            if (i % 2 == 0) {
                result[i] = middle[i - 1];
            } else {
                result[i] = right[i - 1];
            }
        }
        return result;
    }
}
