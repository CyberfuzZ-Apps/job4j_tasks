package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;
        int indexRsl = 0;
        while (indexL < left.length && indexR < right.length) {
            if (left[indexL] <= right[indexR]) {
                rsl[indexRsl] = left[indexL];
                indexL++;
                indexRsl++;
            } else {
                rsl[indexRsl] = right[indexR];
                indexR++;
                indexRsl++;
            }
        }
        while (indexL < left.length) {
            rsl[indexRsl] = left[indexL];
            indexL++;
            indexRsl++;
        }
        while (indexR < right.length) {
            rsl[indexRsl] = right[indexR];
            indexR++;
            indexRsl++;
        }
        return rsl;
    }
}
