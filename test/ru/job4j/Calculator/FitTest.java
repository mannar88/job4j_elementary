package ru.job4j.Calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight187Then100() {
        short in = 187;
        double expected = 100.05;
        double out = ru.job4j.calculator.Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight152Then92() {
        short in = 152;
        double expected = 59.8;
        double out = ru.job4j.calculator.Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}