package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixTransformation {
    public static List<Integer> matrixToList(Integer[][] matrix) {
        return Arrays.stream(matrix).flatMap(i -> Arrays.stream(i)).collect(Collectors.toList());
    }
}
