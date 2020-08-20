package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixTransformationTest {

    @Test
    public void matrixToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> list = MatrixTransformation.matrixToList(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(list, expected);
    }
}