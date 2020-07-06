package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxThird() {
        int result = MultiMax.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void maxSecond() {
        int result = MultiMax.max(1, 5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void maxFirst() {
        int result = MultiMax.max(6, 2, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenEquals() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}