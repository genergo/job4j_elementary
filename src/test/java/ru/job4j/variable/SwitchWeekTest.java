package ru.job4j.variable;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
    assertThat(SwitchWeek.nameOfDay(7), is("Воскресенье"));
    }

    @Test
    public void main() {
    int in = 1;
    String expected = "Понедельник";
    String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }
}