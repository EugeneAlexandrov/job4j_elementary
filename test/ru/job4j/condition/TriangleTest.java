package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean exist = Triangle.exist(2, 2, 2);
        assertThat(exist, is(true));
    }

    @Test
    public void whenDontExist() {
        boolean exist = Triangle.exist(2, 1, 1);
        assertThat(exist, is(false));
    }
}