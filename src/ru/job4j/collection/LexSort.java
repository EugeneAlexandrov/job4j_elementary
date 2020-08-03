package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i1 = Integer.parseInt(o1.split("\\.")[0]);
        int i2 = Integer.parseInt(o2.split("\\.")[0]);
        return Integer.compare(i1, i2);
    }
}
