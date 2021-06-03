package ru.job4j.list;

import java.util.List;
/*
4. Найти индекс элемента.
Задание: метод принимает список и элемент который мы ищем в списке.
Необходимо определить, является ли этот элемент уникальным в этом списке.
Для это необходимо найти первый и последний индекс вхождения элемента.
Если равны - значит элемент уникальный. Необходимо предусмотреть ситуацию,
что такого элемента нет вообще в коллекции, в этом случае также нужно вернуть false.
 */
public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int first = list.indexOf(str);
        int last = list.lastIndexOf(str);
        return first == last ? first != -1 : false;
    }
}
