package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1. flatMap для итератора
Даны вложенные итераторы. Нужно написать метод,
который соберет все элементы данных итераторов в List.
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            while (iterator.hasNext()) {
                rsl.add(iterator.next());
            }
        }
        return rsl;
    }
}
