package ru.job4j.array;

public class Merge {
    /**
     * @param left  first array
     * @param right second array
     * @return third sorted array
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int keyLeft = 0;
        int keyRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (keyLeft >= left.length) {
                rsl[i] = right[keyRight];
                keyRight++;
            } else if (keyRight >= right.length) {
                rsl[i] = right[keyRight];
                keyLeft++;
            } else if (left[keyLeft] < right[keyRight]) {
                rsl[i] = left[keyLeft];
                keyLeft++;
            } else {
                rsl[i] = right[keyRight];
                keyRight++;
            }
        }
        return rsl;
    }
}
