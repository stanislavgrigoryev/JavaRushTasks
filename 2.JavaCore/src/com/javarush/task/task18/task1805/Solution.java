package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        FileInputStream fileInputStream = new FileInputStream(file);
        HashSet<Integer> set = new HashSet<>();
        while (fileInputStream.available() > 0){
            int read = fileInputStream.read();
            set.add(read);
        }
        set.stream().sorted().forEach(integer -> System.out.print(integer + " "));
        fileInputStream.close();
    }
}
