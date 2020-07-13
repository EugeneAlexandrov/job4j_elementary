package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return third > max(first, second) ? third : max(first, second);
    }

    public static int max(int first, int second, int third, int fourth) {
        return fourth > max(first, second, third) ? fourth : max(first, second, third);
    }
}
