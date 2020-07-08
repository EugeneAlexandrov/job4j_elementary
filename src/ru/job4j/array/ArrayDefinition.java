package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Bob Dylan";
        names[1] = "Alex Turner";
        names[2] = "Nick Lane";
        names[3] = "Nick Cave";

        for (String name : names) {
            System.out.println(name);
        }

    }
}
