package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTemp1Then6() {
        int[] temp = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(temp);
        int[] expected = new int[] {6, 2, 3, 4, 5, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] temp = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.black(temp);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}