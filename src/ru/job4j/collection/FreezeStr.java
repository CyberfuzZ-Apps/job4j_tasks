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
        for (int i = 0; i < left.length(); i++) {
            int amount = 1;
            for (int j = i + 1; j < left.length(); j++) {
                if (left.charAt(i) == left.charAt(j)) {
                    amount++;
                }
            }
            leftMap.putIfAbsent(left.charAt(i), amount);
        }
        char[] rightArray = right.toCharArray();
        for (char ch : rightArray) {
            if (!leftMap.containsKey(ch)) {
                return false;
            } else if (leftMap.get(ch) == 1) {
                leftMap.remove(ch);
            } else {
                leftMap.replace(ch, leftMap.get(ch) - 1);
            }
        }
        return leftMap.isEmpty();
    }
}
