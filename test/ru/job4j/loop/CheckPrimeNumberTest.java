package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = CheckPrimeNumber.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = CheckPrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}