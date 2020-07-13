package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        assertThat(1.0, is(a.distance3d(b)));
        Assert.assertEquals(1.73, new Point(0, 0, 0).distance3d(new Point(1, 1, 1)), 0.01);
    }
}