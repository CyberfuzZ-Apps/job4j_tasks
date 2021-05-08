package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int[] pre = new int[data.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i] <= down || data[i] >= up)
                    && (data[i + 1] <= down || data[i + 1] >= up)) {
                pre[index] = i;
                pre[index + 1] = i + 1;
                result[count++] = Arrays.copyOf(pre, index + 2);
            } else if ((data[i] <= down || data[i] >= up)
                    && count == 0) {
                pre[index] = i;
                pre[index + 1] = i;
                result[count++] = Arrays.copyOf(pre, index + 2);
            } else if ((data[i + 1] <= down || data[i + 1] >= up)
                    && count == 0) {
                pre[index] = i + 1;
                pre[index + 1] = i + 1;
                result[count++] = Arrays.copyOf(pre, index + 2);
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Anomaly.found(data, up, down);
        System.out.println(Arrays.deepToString(out));
        //int[][] expect = {new int[] {1, 2}, new int[] {5, 6}};
    }
}
