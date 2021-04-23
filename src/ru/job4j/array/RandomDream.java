package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = "";
        int temp = num / prizes.length;
        if (num % prizes.length == 0) {
            temp--;
        }
        for (int i = 0; i < prizes.length; i++) {
            if (num <= prizes.length && num == i + 1) {
                prize = prizes[i];
                break;
            } else if (num - prizes.length * temp == i + 1) {
                prize = prizes[i];
                break;
            }
        }
        return prize;
    }
}
