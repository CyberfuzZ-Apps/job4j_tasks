package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void bubbleSort() {
        int[] array = {7, 5, 4, 1, 9, 3, 8, 2, 6};
        BubbleSort bubbleSort = new BubbleSort();
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = bubbleSort.bubble(array);
        Assert.assertArrayEquals(expected, result);
    }

}