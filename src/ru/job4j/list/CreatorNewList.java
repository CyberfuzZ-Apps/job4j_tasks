package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
/*
13. Создание списка.
Каким образом мы можем создавать список ArrayList? Все очень просто,
для этого в классе определено 3 конструктора:

ArrayList () - создается пустой список с начальной емкостью 10 элементов.

ArrayList(Collection<? extends E> col) - создается список, в который помещается коллекция col.

ArrayList(int initialCapacity) - создается список с емкостью initialCapacity.

Важно подчеркнуть, что хранение элементов в ArrayList осуществляется в массиве.
Если мы создаем список согласно первому конструктору - создается пустой список
в котором определен массив для хранения элементов на 10 ячеек,
как только количество элементов превышает это значение - происходит расширение массива
и элементы из старого копируются в новый массив (все это реализовано внутри ArrayList,
нам за это беспокоится не нужно). Поэтому если нам заранее известно сколько будет элементов
в списке и количество будет превышать значение 10 - следует сразу создать список
с известной емкостью с целью оптимизации производительности.

Задание: необходимо раскомментировать код и заполнить пропуски (обозначены ...).
При этом необходимо создать список на 10 элементов, добавить в него строки от one до three,
дальше создать второй список в который в виде коллекции добавить первый список.
После этого в цикле forEach вывести все элементы второго списка.
 */
public class CreatorNewList {
    public static void main(String[] args) {
        System.out.println("Создаем список с пустым конструктором.");
        List<String> first = new ArrayList<>();
        System.out.println("Добавляем 3 элемента в список.");
        first.add("one");
        first.add("two");
        first.add("three");
        System.out.println("Создаем список - в конструктор передаем коллекцию.");
        List<String> second = new ArrayList<>(first);
        System.out.println("Выводим все элементы в списке.");
        for (String s : second) {
            System.out.println(s);
        }
    }
}
