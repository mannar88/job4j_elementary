package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                ;
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "воскресенье";
                break;
            default:
            name = "Ошибка! Варнинг! в неделе всего 7 дней!!!, хотя дай создателям Job4j волю, в сутках было 27 часов и без выходных - все 9 дней в неделю";
                break;
        }

    return name;
    }
}
