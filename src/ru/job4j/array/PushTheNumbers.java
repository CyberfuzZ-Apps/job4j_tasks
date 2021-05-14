package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        System.arraycopy(array[row], column, array[row], column + 1,
                array[row].length - column - 1);
        for (int i = 0; i < column; i++) {
            array[row][i] = array[row][i + 1];
        }
        for (int i = 0; i < row; i++) {
            array[i][column] = array[i + 1][column];
            if (row != array.length - 1) {
                array[array.length - 1 - i][column] = array[array.length - 2 - i][column];
            }
        }
        array[row][column] = 0;
    }
}
