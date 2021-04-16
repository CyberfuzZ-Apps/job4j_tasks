package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i += 2) {
            result += i;
        }
        return result;
    }
}
