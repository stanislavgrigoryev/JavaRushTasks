package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringJoiner joiner = new StringJoiner(" and ");
        if (params.isEmpty()){
            return "";
        }
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (entry.getValue() != null) {
                joiner.add(key + " = " + "'" + value + "'");
            }
        }
        return joiner.toString();
    }
}
