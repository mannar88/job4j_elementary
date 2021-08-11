package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

        @Test
    public void whenArrayHas5Then2() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHas7nThen() {
        int[] data = {5, 2, 7, 8};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
@Test
public void whenArrayHasNonThen0() {
    int[] data = {5, 4, 3, 2};
    int el = 7;
    int result = FindLoop.indexOf(data, el);
    int expected = -1;
    Assert.assertEquals(expected, result);
}

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenFind4() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 4;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenFind8() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected =-1 ;
        Assert.assertEquals(expected, result);
    }

}