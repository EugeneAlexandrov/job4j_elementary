package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        final double k = percentConvertToKoef(percent);
        double debt = amount * k;
        do {
            debt -= salary;
            debt *= k;
            year++;
        }
        while (debt > 0);
        return year;
    }

    private static double percentConvertToKoef(double percent) {
        return (percent + 100) / 100;
    }
}
