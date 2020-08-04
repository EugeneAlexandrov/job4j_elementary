package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String firstelement1 = o1.split("/")[0];
        String firstelement2 = o2.split("/")[0];

        if (firstelement1.equals(firstelement2)) {
            return o1.compareTo(o2);
        }
        return firstelement2.compareTo(firstelement1);
    }
}
