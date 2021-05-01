package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int tmp = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
        }
        nums[0] = tmp;
    }
}
