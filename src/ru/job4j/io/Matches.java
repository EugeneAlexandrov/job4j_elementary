package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player = 0;
        int match = 11;
        while (match > 0) {
            System.out.printf("На столе %d спичек\n", match);
            System.out.printf("Ходит %d игрок! Сколько спичек возьмете? Ответ:\n", (player++ % 2) + 1);
            int answer = Integer.valueOf(input.nextLine().trim());
            match -= answer;
        }
        System.out.printf("Выиграл %d игрок", ((player - 1) % 2) + 1);
    }
}
