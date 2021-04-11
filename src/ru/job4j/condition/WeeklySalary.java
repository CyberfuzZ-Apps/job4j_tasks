package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] <= 8) {
                sum += hours[i] * 10;
            } else {
                sum += (hours[i] - 8) * 15 + 80;
            }
        }
        for (int i = 5; i < 7; i++) {
            if (hours[i] <= 8) {
                sum += (hours[i] * 10) * 2;
            } else {
                sum += ((hours[i] - 8) * 15 + 80) * 2;
            }
        }
        return sum;
    }
}
