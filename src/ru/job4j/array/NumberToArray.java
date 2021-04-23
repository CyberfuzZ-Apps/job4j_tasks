package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String strNum = String.valueOf(number);
        int[] array = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
}
