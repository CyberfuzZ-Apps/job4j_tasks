package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = 0;
        int tmp = n;
        while (n >= d) {
            n -= d;
            rsl++;
        }
        return tmp - d * rsl;
    }
}
