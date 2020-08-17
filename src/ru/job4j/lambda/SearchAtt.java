package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment attachment : list) {
            if (func.test(attachment)) {
                rsl.add(attachment);
            }
        }
        return rsl;
    }

    public static List<Attachment> nameFilter(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> sizeFilter(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        return filter(list, func);
    }
}
