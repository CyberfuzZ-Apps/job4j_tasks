package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
/*
6.2. Промежуточные операции. Метод filter(). Фильтрация строк
Если условие громоздкое, то можно расположить несколько вызовов filter подряд.
Ваша задача отфильтровать список строк по следующему признаку.
Строка должна начинаться на "A" и заканчиваться на ".java"
 */
public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(f -> f.startsWith("A"))
                .filter(e -> e.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
