package ru.job4j.list;

import java.util.List;
/*
8. Удаление одного списка из другого

Рассмотрим методы, которые позволяют удалять целые наборы данных из списка.
Для этого можно использовать методы removeAll() и retainAll(). Зачем сразу 2 метода,
спросите Вы. Ответ простой - для того чтобы определить разное поведение при удалении.

Подробнее:

boolean removeAll (Collection<?> col) - метод удаляет из списка все элементы,
которые содержатся в коллекции col, если в результате работы метода исходный список изменился -
метод возвращает true.

boolean retainAll (Collection<?> col) - метод также удаляет элементы из списка,
за исключением тех, которые находятся в коллекции col, если в результате работы метода
исходный список изменился - метод возвращает true.

Задание: метод принимает 3 списка элементов:
1. Общий список элементов;
2. Список важных элементов, но не обязательных;
3. Список элементов, которые обязательно должны отсутствовать в результирующем списке.

Необходимо реализовать метод, который вернет список, основой которого будет первый,
присутствовать элементы из второго и точно отсутствовать элементы из третьего.
Используйте методы о которых говорилось выше.
 */
public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }
}
