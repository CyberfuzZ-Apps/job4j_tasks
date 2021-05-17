package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][str.length];
        int commonCount = 1;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                result[firstIndex][secondIndex++] = str[i];
            } else {
                result[firstIndex] = Arrays.copyOf(result[firstIndex], secondIndex);
                firstIndex++;
                secondIndex = 0;
                commonCount++;
            }
            if (i == str.length - 1) {
                result[firstIndex] = Arrays.copyOf(result[firstIndex], secondIndex);
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
