package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        return (float) value / 70;
    }

    public static float rubleToDollar(int value) {
        return (float) value / 60;
    }

    public static void main(String[] args) {
        int inRub = 140;
        float expectedEuro = 2;
        float expectedUSD = (float) inRub / 60;
        float outEuro = rubleToEuro(inRub);
        float outUSD = rubleToDollar(inRub);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedUSD = expectedUSD == outUSD;
        System.out.printf("%1$d rubles are %2$.1f euro. Test:%3$s\n", inRub, outEuro, passedEuro);
        System.out.printf("%1$d rubles are %2$.1f dollars. Test:%3$s\n", inRub, outUSD, passedUSD);
    }
}
