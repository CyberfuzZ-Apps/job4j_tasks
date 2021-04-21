package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] arrayUp = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                arrayUp[i] = Character.toUpperCase(string[i]);
            } else {
                arrayUp[i] = string[i];
            }
        }
        return arrayUp;
    }
}
