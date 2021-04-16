package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int multi = a;
        for (int i = a; i <= b; i++) {
            multi *= i;
        }
        return multi;
    }
}
