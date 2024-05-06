package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line = console.readLine();
        System.out.println("Введите полный путь файла архива:");
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(line));
        String line2 = console.readLine();
        System.out.println("Введите полное имя файла для архивации:");
        zipFileManager.createZip(Paths.get(line2));
    }
}
