package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SchoolTest {

    List<Student> list;

    @Before
    public void setUp() throws Exception {
        /*
        10А диапазон балла [70: 100],
        10Б диапазон балла [50: 70);
        10B диапазон балла (0: 50);
        */
        list = List.of(
                new Student("Ivanov", 80),
                new Student("Petrov", 50),
                new Student("Sidorov", 70),
                new Student("Alexandrov", 90),
                new Student("Mihailov", 40)
        );
    }

    @Test
    public void collectClassA() {
        List<Student> classA = School.collect(list, (x) -> x.getScore() >= 70);
        List<Student> expected = List.of(
                new Student("Ivanov", 80),
                new Student("Sidorov", 70),
                new Student("Alexandrov", 90)
        );
        assertEquals(classA, expected);
    }

    @Test
    public void collectClassB() {
        List<Student> classA = School.collect(list, (x) -> x.getScore() >= 50 && x.getScore() < 70);
        List<Student> expected = List.of(
                new Student("Petrov", 50)
        );
        assertEquals(classA, expected);
    }

    @Test
    public void collectClassC() {
        List<Student> classA = School.collect(list, (x) -> x.getScore() < 50);
        List<Student> expected = List.of(
                new Student("Mihailov", 40)
        );
        assertEquals(classA, expected);
    }
}