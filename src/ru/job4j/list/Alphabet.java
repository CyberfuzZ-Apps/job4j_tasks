package ru.job4j.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*
16. Буквы в алфавитном порядке.
Вам необходимо реализовать метод, который принимает строку,
которое является одним словом, без знаков препинания цифр и пробелов.
Метод должен вернуть новую строку, в которой все символы исходной строки
будут расставлены в алфавитном порядке.

Для разделения строки на подстроки используйте метод split(),
добавьте все элементы в коллекцию List<String>, отсортируйте в порядке возрастания -
используйте метод sort, в который передадите компаратор. Новую строку сформируйте
с помощью StringBuilder.
 */
public class Alphabet {
    public static String reformat(String s) {
        List<String> list = Arrays.asList(s.split(""));
        list.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
