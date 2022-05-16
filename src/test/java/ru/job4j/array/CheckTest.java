package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataMonoByTrueThenFalseThenTrue() {
        boolean[] input = new boolean[]{true, false, true};
        boolean result = Check.mono(input);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenFalseThenFalse() {
        boolean[] input = new boolean[]{false, false, false};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }
}