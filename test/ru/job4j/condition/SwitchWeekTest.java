package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDaMony() {
    int day = 1;
     String  rsl = SwitchWeek.nameOfDay(day);
String expected = "понедельник";
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void nameOfDa2() {
        int day = 2;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "вторник";
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void nameOfDa3() {
        int day = 3;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "среда";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void nameOfDa4() {
        int day = 4;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "четверг";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void nameOfDa5() {
        int day = 5;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "пятница";
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void nameOfDa6() {
        int day = 6;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "суббота";
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void nameOfDa7() {
        int day = 7;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "воскресенье";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void nameOfDa9() {
        int day = 9;
        String  rsl = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка! Варнинг! в неделе всего 7 дней!!!, хотя дай создателям Job4j волю, в сутках было 27 часов и без выходных - все 9 дней в неделю";
        Assert.assertEquals(expected, rsl);
    }


}