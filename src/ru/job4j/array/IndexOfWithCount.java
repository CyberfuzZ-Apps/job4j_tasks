package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = -1;
        int tmp = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                tmp++;
                if (tmp == number) {
                    index = i;
                }
            }
        }
        return index;
    }
}
