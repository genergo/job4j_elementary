package ru.job4j.Variable;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2dot2222Dollar() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        boolean passed = expected == out;
        Assert.assertEquals(expected, out, eps);
    }

   }
