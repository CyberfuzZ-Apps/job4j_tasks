package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
11. Реализовать словарь.
В данном задании необходимо реализовать словарь. Метод принимает массив строк.
Необходимо перебрать массив и добавить строки в карту таким образом,
чтобы ключом был первый символ строки, а значением - список строк,
которые начинаются на первый символ строки.
 */
public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String key = String.valueOf(string.charAt(0));
            List<String> values = new ArrayList<>();
            for (String str : strings) {
                if (key.equals(String.valueOf(str.charAt(0)))) {
                    values.add(str);
                }
            }
            rsl.put(key, values);
        }
        return rsl;
    }
}
