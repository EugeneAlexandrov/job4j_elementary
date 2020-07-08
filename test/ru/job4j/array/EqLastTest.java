package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }

    @Test
    public void whenZeroArray() {
        int[] left = {};
        int[] right = {};
        assertThat(check(left, right), is(false));
    }

    @Test
    public void whenZeroArray1() {
        int[] left = {1, 3};
        int[] right = {};
        assertThat(check(left, right), is(false));
    }

    @Test
    public void whenZeroArray2() {
        int[] left = {};
        int[] right = {2, 3};
        assertThat(check(left, right), is(false));
    }
}