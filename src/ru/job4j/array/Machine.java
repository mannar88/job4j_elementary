package ru.job4j.array;

import javax.swing.text.MaskFormatter;
import java.rmi.MarshalException;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
      int  difference = money - price;
        for ( int coinsI : coins){
    while (coinsI <= difference) {
                rsl[size] = coinsI;
                difference += - coinsI;
size++;
            }
        }
        return Arrays.copyOf(rsl, size );
    }
}
