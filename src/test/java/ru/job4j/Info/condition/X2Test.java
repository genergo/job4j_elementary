package ru.job4j.Info.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class X2Test {

   @Test
    public void whenA1B1C1X1Then4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl1);
    }

    @Test
    public void whenA0B1C1X1Then4() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C0X1Then3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void whenA1B1C1X0Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}