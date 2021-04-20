package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                array[i] += array[j];
            }
        }
        return array;
    }
}
