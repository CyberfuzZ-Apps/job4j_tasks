package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl == left + right) {
            return "added";
        } else if (rsl == left - right) {
            return "subtracted";
        } else if (rsl == left * right) {
            return "multiplied";
        } else if (rsl == left / right) {
            return "divided";
        } else {
            return "none";
        }
    }
}
