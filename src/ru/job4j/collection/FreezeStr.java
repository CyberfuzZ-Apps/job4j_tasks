package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/*
2. Проверить две строчки на идентичность.
Даны две строки. Нужно проверить, что вторая строка получилась методом
перестановок символов в первой строке.
 */
public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> leftMap = new HashMap<>();
        Map<Character, Integer> rightMap = new HashMap<>();
        for (int i = 0; i < left.length(); i++) {
            int amount = 1;
            for (int j = i + 1; j < left.length(); j++) {
                if (left.charAt(i) == left.charAt(j)) {
                    amount++;
                }
            }
            leftMap.putIfAbsent(left.charAt(i), amount);
        }
        for (int i = 0; i < right.length(); i++) {
            int amount = 1;
            for (int j = i + 1; j < right.length(); j++) {
                if (right.charAt(i) == right.charAt(j)) {
                    amount++;
                }
            }
            rightMap.putIfAbsent(right.charAt(i), amount);
        }
        return leftMap.equals(rightMap);
    }
}
