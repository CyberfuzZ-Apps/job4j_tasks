package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int index = 0;
        int[] rslArray = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    rslArray[index++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(rslArray, index);
    }
}
