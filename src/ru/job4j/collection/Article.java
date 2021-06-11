package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
1. Генератор текста
Задан большой текст. Из него вырезают слова и предложения. Из них составляют новый текст.
Нужно проверить, что новый текст был получен из оригинального.
 */
public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> originSet = new HashSet<>(Arrays.asList(origin.toLowerCase()
                        .replaceAll("\\p{Punct}", "").split(" ")));
        String[] lineArray = line.toLowerCase()
                .replaceAll("\\p{Punct}", "").split(" ");
        for (String str : lineArray) {
            if (!originSet.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
