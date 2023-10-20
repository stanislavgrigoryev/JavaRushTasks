package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
      labels.put(1.2,"dbagb");
      labels.put(1.3,"kbkmb");
      labels.put(1.4,"hnjsy");
      labels.put(1.5, "jstms");
      labels.put(1.6,"fkfim");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
