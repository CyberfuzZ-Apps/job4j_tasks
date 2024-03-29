package ru.job4j.map;

import java.util.*;
/*
13. Данные об осадках
Метод принимает список объектов Info. При это эти объекты содержат два поля:

1. city - название города, где производились наблюдения;
2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.

Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info
в котором будет указано имя города наблюдения и общее количество осадков за период наблюдения.
 */
public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i).city)) {
                int rain = list.get(i).rainfall;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).city.equals(list.get(j).city)) {
                        rain += list.get(j).rainfall;
                    }
                }
                map.put(list.get(i).city, rain);
            }
        }
        for (String city : map.keySet()) {
            Info info = new Info(city, map.get(city));
            rsl.add(info);
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}


