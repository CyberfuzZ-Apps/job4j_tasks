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
            }
        }
        if (data[data.length - 1] >= up || data[data.length - 1] <= down && count == 0) {
            pre[index] = data.length - 1;
            pre[index + 1] = data.length - 1;
            result[count++] = Arrays.copyOf(pre, 2);
        }
        return Arrays.copyOf(result, count);
    }
}
