package ru.job4j.loop;

import javax.crypto.spec.IvParameterSpec;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <=  nik){
            month++;
        ivan *= 3;
        nik *= 2;
        }
        return month;
    }
}
