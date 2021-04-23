package ru.job4j.array;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int rslLength = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    rslLength++;
                }
            }
        }
        int[] rslArray = new int[rslLength];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    rslArray[index++] = data[i][j];
                }
            }
        }
        return rslArray;
    }
}
