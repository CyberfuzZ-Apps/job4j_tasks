package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int temp = 0;
        int index1 = 0;
        int index2 = 0;
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i].length;
        }
        for (int i = 0; i <= temp; i++) {
            if (temp <= i * i) {
                newLength = i;
                break;
            }
        }
        int[][] squadArray = new int[newLength][newLength];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                squadArray[index1][index2++] = array[i][j];
                if (index2 > squadArray.length - 1) {
                    index1++;
                    index2 = 0;
                }
            }
        }
        return squadArray;
    }
}
