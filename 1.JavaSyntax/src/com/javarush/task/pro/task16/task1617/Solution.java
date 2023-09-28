package com.javarush.task.pro.task16.task1617;

import java.time.*;

/* 
Временная глобализация
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        ZonedDateTime globalTime1 = localDateTime.atZone(zoneId);
        globalTime = globalTime1;

        System.out.println(globalTime);
    }
}
