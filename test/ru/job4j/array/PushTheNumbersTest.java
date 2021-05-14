package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class PushTheNumbersTest {

    @Test
    public void testWithArray5To5() {
        int[][] array = {
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55 }
        };
        PushTheNumbers.push(array, 2, 2);
        int[][] expected = {
                {62, 12, 10, 96, 2},
                {78, 98, 47, 45, 86},
                {59, 47, 0, 47, 88},
                {99, 10, 47, 73, 88},
                {32, 48, 91, 87, 55}
        };
        assertThat(array, is(expected));
    }

    @Test
    public void testWithArray4To4() {
        int[][] array = {
                {29, 29, 48, 92},
                {90, 58, 7, 57},
                {87, 36, 21, 19},
                {93, 55, 60, 89}
        };
        PushTheNumbers.push(array, 3, 1);
        int[][] expected = {
                {29, 58, 48, 92},
                {90, 36, 7, 57},
                {87, 55, 21, 19},
                {55, 0, 55, 60}
        };
        assertThat(array, is(expected));
    }

    @Test
    public void testWithArray6To6() {
        int[][] array = {
                {62, 12, 86, 96, 2, 4},
                {78, 98, 10, 45, 86, 2},
                {82, 59, 47, 88, 79, 6},
                {99, 10, 91, 73, 88, 7},
                {32, 48, 8, 87, 55, 3},
                {57, 12, 67, 4, 2, 78}
        };
        PushTheNumbers.push(array, 3, 4);
        int[][] expected = {
                {62, 12, 86, 96, 86, 4},
                {78, 98, 10, 45, 79, 2},
                {82, 59, 47, 88, 88, 6},
                {10, 91, 73, 88, 0, 88},
                {32, 48, 8, 87, 88, 3},
                {57, 12, 67, 4, 55, 78}
        };
        assertThat(array, is(expected));
    }
}