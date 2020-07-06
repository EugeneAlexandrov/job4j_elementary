package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void zeroPoints() {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 0;
        Assert.assertEquals(expected, result, 0.1);
    }

    @Test
    public void samePoints() {
        int x1 = 2, x2 = 2, y1 = 2, y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 0;
        Assert.assertEquals(expected, result, 0.1);
    }

    @Test
    public void backwardPoints() {
        int x1 = 2, y1 = 2, x2 = 1, y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 1;
        Assert.assertEquals(expected, result, 0.1);
    }
}