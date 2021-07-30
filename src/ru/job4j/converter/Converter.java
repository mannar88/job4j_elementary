package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl =value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float usd =Converter.rubleToDollar(140);
//ниже решил сделать округление до 2 знака после точки ибо не видержала душа длинных дробей - перфекционизм.
        String resultEuro= String.format("%.2f",euro);
        String resultUsd = String.format("%.2f",usd);
        System.out.println("140 rubles are " + resultEuro + " euro.");
        System.out.println("140 rubles are " + resultUsd + " usd.");
    }
}