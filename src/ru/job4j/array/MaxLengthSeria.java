package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxLength = 1;
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                maxLength++;
            } else if (maxLength > tmp) {
                tmp = maxLength;
                maxLength = 1;
            } else {
                maxLength = 1;
            }
        }
        return tmp > maxLength ? tmp : maxLength;
    }
}
