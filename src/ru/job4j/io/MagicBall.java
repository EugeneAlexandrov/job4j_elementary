package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        System.out.print("Задай вопрос:");
        String name = scanner.nextLine();
        answer();
    }

    private static void answer() {
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1:
                System.out.println("Yes");
                break;
            case 2:
                System.out.println("No");
                break;
            default:
                System.out.println("Maybe");
        }
    }
}
