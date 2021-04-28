package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                builder.append(s.charAt(i + 1));
            }
        }
        return builder.toString();
    }
}
