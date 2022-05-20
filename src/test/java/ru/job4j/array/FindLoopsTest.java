package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopsTest {

         @Test
        public void whenArrayHas5Then0() {
            int[] data = new int[] {5, 10, 3};
            int el = 5;
            int result = FindLoops.indexOf(data, el);
            int expected = 0;
            Assert.assertEquals(expected, result);
        }

        @Test
        public void whenDiapasonHas2Then3() {
            int[] data = new int[]{5, 2, 10, 2, 4};
            int el = 2;
            int start = 2;
            int finish = 4;
            int result = FindLoops.indexInRange(data, el, start, finish);
            int expected = 3;
            Assert.assertEquals(expected, result);
        }

            @Test
            public void whenDiapasonHasNot8ThenMinus1() {
                int[] data = new int[] {5, 2, 10, 2, 4};
                int el = 8;
                int start = 2;
                int finish = 4;
                int result = FindLoops.indexInRange(data, el, start, finish);
                int expected = -1;
                Assert.assertEquals(expected, result);
                /*Дописать тест, когда элемент 8 в диапазоне не найден. Можно искать любой другой элемент, корректно отражая этот факт в названии теста.*/
            }

            @Test
            public void whenDiapasonHasNot8ThenTrue() {
                int[] data = new int[] {5, 2, 10, 2, 4};
                int el = 2;
                int start = 2;
                int finish = 4;
                boolean result = FindLoops.indexInConteinsRan(data, el, start, finish);
                boolean expected = true;
                Assert.assertEquals(expected, result);
                /*Дописать тест, когда элемент 8 в диапазоне не найден. Можно искать любой другой элемент, корректно отражая этот факт в названии теста.*/
            }

            @Test
            public void whenDiapasonHasNot8ThenFalse() {
                int[] data = new int[] {5, 2, 10, 2, 4};
                int el = 3;
                int start = 2;
                int finish = 4;
                boolean result = FindLoops.indexInConteinsRan(data, el, start, finish);
                boolean expected = false;
                Assert.assertEquals(expected, result);
                /*Дописать тест, когда элемент 8 в диапазоне не найден. Можно искать любой другой элемент, корректно отражая этот факт в названии теста.*/
            }
    }
