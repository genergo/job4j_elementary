package ru.job4j.variable;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP7K2Then3() {
        int expected = 2;
        int p = 7;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K4Then4() {
        int expected = 4;
        int p = 12;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Then9() {
        int expected = 5;
        int p = 12;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square() {
    }

    @Test
    public void main() {
    }
}
