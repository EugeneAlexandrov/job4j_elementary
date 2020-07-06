package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 2;
        int k = 2;
        double expected = 0.22;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01f);
    }

    @Test
    public void squareZero() {
        int p = 0;
        int k = 0;
        double expected = 0;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01f);
    }
}