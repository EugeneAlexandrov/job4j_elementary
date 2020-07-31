package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int lenght = Math.max(o1.length(), o2.length());
        char[][] word = new char[2][lenght];
        for (int i = 0; i < o1.length(); i++) {
            word[0][i] = o1.charAt(i);
        }
        for (int i = 0; i < o2.length(); i++) {
            word[1][i] = o2.charAt(i);
        }
        for (int i = 0; i < lenght; i++) {
            if (word[0][i] < word[1][i]) {
                return -1;
            } else if (word[0][i] > word[1][i]) {
                return 1;
            }
        }
        return 0;
    }
}