package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in  = Factorial.calc(5);
        int out = 120;
        int expected = 120;
        assertThat(in, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in  = Factorial.calc(0);
        int out = 1;
        int expected = 1;
        assertThat(in, is(expected));
    }
}