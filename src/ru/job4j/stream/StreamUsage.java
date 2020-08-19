package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> tasks = List.of(-1, 5, 6, 8, 0, -10, -500, 500, 60
        );
        List<Integer> positive = tasks.stream().filter(
                i -> i > 0
        ).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
