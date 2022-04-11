package ru.job4j.variable;

import org.junit.Test;
import org.junit.Assert;

public class ChessBoardTest {

    @Test
    public void wayIs6() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}