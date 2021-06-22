package ru.job4j.lambda;

import java.util.Optional;

/*
5.3. Optional. Метод ifPresent()
Иногда нужно при нахождении Optional выполнить какое-то действие.
Для этого существует метод ifPresent(), он принимает Consumer, который будет выполнен,
если значение Optional не пустое.

Например,

Optional.of(1).ifPresent(System.out::println); // выведется 1

Optional.empty().ifPresent(System.out::println); // ничего не выведется, потому что значения нет

Ваша задача:

1. Написать метод max(). Он находит максимальный элемент массива. Если массив пуст,
то возвращает пустой Optional, в противном случае Optinal из максимального значения
2. Метод ifPresent() вызывает метод max(). Если значение существует,
то выводит максимальное значение например, "Max: 3".
Для вывода нужно использовать System.out.println()
 */
public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        Optional<Integer> rsl = max(data);
        rsl.ifPresent(integer -> System.out.println("Max: " + integer));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length > 0) {
            int maxEl = data[0];
            for (int i = 1; i < data.length; i++) {
                if (maxEl < data[i]) {
                    maxEl = data[i];
                }
            }
            return Optional.of(maxEl);
        }
        return Optional.empty();
    }
}
