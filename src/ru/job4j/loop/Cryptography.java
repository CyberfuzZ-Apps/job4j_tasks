package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder builder = new StringBuilder();
        if (s == null || s.equals("")) {
            builder.append("empty");
        } else if (s.length() <= 4) {
            builder.append(s);
        } else {
            builder.setLength(s.length());
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 4) {
                    builder.setCharAt(i, '#');
                } else {
                    builder.setCharAt(i, s.charAt(i));
                }
            }
        }
        return builder.toString();
    }
}
