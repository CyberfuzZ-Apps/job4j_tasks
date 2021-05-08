package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                firstTeam += players[i];
            } else {
                secondTeam += players[i];
            }
        }
        if (firstTeam > secondTeam) {
            return 1;
        } else if (firstTeam < secondTeam) {
            return 2;
        } else {
            return 0;
        }
    }
}
