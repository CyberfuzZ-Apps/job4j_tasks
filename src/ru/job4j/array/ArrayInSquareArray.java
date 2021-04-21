package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int newLength = array.length / 2 == 1 ? array.length / 2 + 1 : array.length / 2;
        int[][] result = new int[newLength][newLength];
        int index = 0;
        label: {
            for (int i = 0; i < newLength; i++) {
                for (int j = 0; j < newLength; j++) {
                    result[i][j] = array[index++];
                    if (index > array.length - 1) {
                        break label;
                    }
                }
            }
        }
        return result;
    }
}
