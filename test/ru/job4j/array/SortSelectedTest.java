package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

@Test
public void whenSort312() {
       int [] delta = new int [] {3, 1, 2};
       int [] rst = SortSelected.sort(delta);
       int [] inspect = new int  [] {1, 2, 3};
        Assert.assertArrayEquals (rst, inspect);

}
@Test
public void whenSort1050302040() {
int [] delta = new  int []{10, 50, 30, 20, 40};
    int[] rst = SortSelected.sort(delta);
    int[] inspect = new int[]{10, 20, 30, 40, 50};
    Assert.assertArrayEquals(rst, inspect);
    }
    }