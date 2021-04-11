package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            return (int) (prize * percent - pay);
        } else {
            return 0;
        }
    }
}
