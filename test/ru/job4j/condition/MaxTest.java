package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenBothEqual() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenFirstBiggerThenSecond() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenFourthBigger() {
        int result = Max.max(3, 1, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdBigger() {
        int result = Max.max(3, 1, 5);
        assertThat(result, is(5));
    }
}