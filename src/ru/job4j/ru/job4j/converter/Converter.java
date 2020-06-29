package ru.job4j.ru.job4j.converter;

import java.math.RoundingMode;

public class Converter {
    public static float rubleToEuro(int value) {
        return (float)value/70;
    }

    public static float rubleToDollar(int value) {
        return (float) value / 60;
    }

    public static void main(String[] args) {
        int rub = 550;
        System.out.printf("%1$d rubles are %2$.1f euro.\n", rub, rubleToEuro(rub));
        System.out.printf("%1$d rubles are %2$.1f dollars.\n", rub, rubleToDollar(rub));
    }
}
