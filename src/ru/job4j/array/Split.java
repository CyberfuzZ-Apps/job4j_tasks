package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][str.length];
        int first = 0;
        int second = 0;
        for (char value : str) {
            if (value != c) {
                result[first][second++] = value;
            } else {
                result[first] = Arrays.copyOf(result[first], second);
                first++;
                second = 0;
            }
            result[first + 1] = Arrays.copyOf(result[first], second);
        }
        return Arrays.copyOf(result, first + 1);
    }

    public static void main(String[] args) {
        char[] in = {'o', 'n', 'e', ' ', 't', 'w', 'o', ' ', 't', 'h', 'r', 'e'};
        char c = ' ';
        System.out.println(Arrays.deepToString(split(in, c)));
    }
}
