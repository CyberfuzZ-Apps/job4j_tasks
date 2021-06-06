package ru.job4j.map;

import java.util.*;

/*
12. Индексы символов
Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
При реализации необходимо игнорировать пробелы во входной строке.

Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки,
а значением - список индексов, под которыми этот символ (если таких символов несколько)
входит в исходную строку. Важно: строчные и прописные символы считаются разными символами.
 */
public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        char[] letters = s.replaceAll(" ", "").toCharArray();
        for (char key : letters) {
            List<Integer> values = new ArrayList<>();
            for (int i = 0; i < letters.length; i++) {
                if (key == letters[i]) {
                    values.add(i);
                }
            }
            rsl.put(key, values);
        }
        return rsl;
    }
}
