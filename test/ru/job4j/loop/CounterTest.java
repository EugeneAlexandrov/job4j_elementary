package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenDifferentArguments() {
        int result = Counter.sum(0, 10);
        int expected = 55;
        assertThat(result, is(expected));
    }

    @Test
    public void whenEqualsArguments() {
        int result = Counter.sum(5, 10);
        int expected = 45;
        assertThat(result, is(expected));
    }

    @Test
    public void whenZeroArguments() {
        int result = Counter.sum(0, 0);
        int expected = 0;
        assertThat(result, is(expected));
    }
}