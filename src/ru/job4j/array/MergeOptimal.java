package ru.job4j.array;

public class MergeOptimal {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0, indexR = 0, indexRsl = 0;
        while (indexL < left.length && indexR < right.length) {
            rsl[indexRsl++] = left[indexL] < right[indexR] ? left[indexL++] : right[indexR++];
        }
        while (indexL < left.length) {
            rsl[indexRsl++] = left[indexL++];
        }
        while (indexR < right.length) {
            rsl[indexRsl++] = right[indexR++];
        }
        return rsl;
    }
}