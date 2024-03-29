package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
2.3. Группировка элементов и сумма. Метод summingInt()
Если нам нужно подсчитать сумму элементов при группировке,
то можем использовать коллектор Collectors.summingInt(),
этот коллектор суммирует в int. Он принимает функцию
в которой мы должны преобразовать наш объект к int

Например, просуммируем четные и нечетные элементы.
В примере summingInt принимает n -> n, т.к. в списке уже хранятся числа

List.of(1, 2, 3, 4, 5, 6).stream()
        .collect(Collectors.groupingBy(
                 n -> n % 2,
                 Collectors.summingInt(n -> n)
        )).forEach((k, v) -> System.out.println(k + " " + v));

//0 12
//1 9

Вам дан список пользователей, у каждого пользователя есть счет.
Ваша задача найти сумму баланса для каждого пользователя.

Подсказка: нужно использовать вспомогательный класс для группировки Pair
 */
public class SummingMethod {
    public static class User {

        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        return users.stream()
                .flatMap(u -> u.bills.stream()
                        .map(b -> new Pair(u, b)))
                .collect(Collectors.groupingBy(n -> n.user.name,
                        Collectors.summingInt(b -> b.bill.balance)));
    }
}
