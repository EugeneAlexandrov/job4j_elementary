package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {

        return (left.length > 0 & right.length > 0) && left[left.length - 1] == right[right.length - 1];
    }
}
