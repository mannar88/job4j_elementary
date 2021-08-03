package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEvenTest() {

    int sum = 2;
    boolean result = LogicNot.isEven(sum);
        Assert.assertTrue(result);
    }

    @Test
    public void isPositiveTest() {
    int sum = 2;
        boolean result = LogicNot.isPositive(sum);
        Assert.assertTrue(result);

    }

    @Test
    public void notEvenTest() {
        int sum = 3;
        boolean result = LogicNot.notEven(sum);
        Assert.assertTrue(result);

    }

    @Test
    public void notPositiveTest() {
        int sum = -2;
        boolean result = LogicNot.notPositive(sum);
        Assert.assertTrue(result);

    }

    @Test
    public void notEvenAndPositiveTest() {
        int sum = 3;
        boolean result = LogicNot.notEvenAndPositive(sum);
        Assert.assertTrue(result);

    }

    @Test
    public void evenOrNotPositiveTest() {
        int sum =-2;
        boolean result = LogicNot.evenOrNotPositive(sum);
        Assert.assertTrue(result);

    }
}