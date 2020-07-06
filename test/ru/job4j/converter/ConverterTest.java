package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.05f);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        float expected = 3f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.05f);
    }
}