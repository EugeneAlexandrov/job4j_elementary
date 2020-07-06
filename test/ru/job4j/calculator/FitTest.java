package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short height = 190;
        double expected = 103.5;
        double result = Fit.manWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void womanWeight() {
        short height = 190;
        double expected = 92;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }
}