package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void findMinTest() {
        assertThat(MinDiapason.findMin(new int[]{10, 5, 3, 1}, 1, 3), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[]{10, 2, 5, 1}, 0, 2), is(2));
    }
}