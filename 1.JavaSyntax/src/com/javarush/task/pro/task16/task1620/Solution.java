package com.javarush.task.pro.task16.task1620;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Еще один простой шаблон
*/

public class Solution {

    static ZoneId zoneId = ZoneId.of("Europe/Kiev");
    static ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String format = dateTimeFormatter.format(zonedDateTime);
        System.out.println(format);
    }
}
