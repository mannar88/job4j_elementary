package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        String name = "Понедельник";
        int rsl = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, rsl);

    }
}