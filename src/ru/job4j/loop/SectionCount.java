package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int rsl = 0;
        while (length >= section) {
            length -= section;
            rsl++;
        }
        return rsl;
    }
}
