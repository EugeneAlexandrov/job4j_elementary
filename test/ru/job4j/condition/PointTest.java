package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void zeroPoints() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assert.assertEquals(0, a.distance(b), 0.1);
    }

    @Test
    public void samePoints() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        Assert.assertEquals(0, a.distance(b), 0.1);
    }

    @Test
    public void backwardPoints() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 2);
        Assert.assertEquals(1, a.distance(b), 0.1);
    }
}