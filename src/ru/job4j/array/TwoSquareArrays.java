package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * right.length];
        int index = 0;
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < left[0].length; j++) {
                    if (left[i][j] > right[i][j]) {
                        result[index++] = left[i][j];
                    } else {
                        result[index++] = right[i][j];
                    }
                }
            }

        return result;
    }
}
