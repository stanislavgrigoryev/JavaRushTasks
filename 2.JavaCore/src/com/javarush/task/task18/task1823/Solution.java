package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file = console.readLine();
            if (file.equals("exit")) {
                break;
            }
            ReadThread thread = new ReadThread(file);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> map = new HashMap<>();
            try ( FileInputStream fileInputStream = new FileInputStream(fileName)){
                while (fileInputStream.available()>0){
                    int read = fileInputStream.read();
                    map.merge(read,1, Integer::sum);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Integer max = Collections.max(map.values());
            map.entrySet().stream().filter(entry -> entry.getValue().equals(max))
                    .findFirst().ifPresent(entry -> resultMap.put(fileName,entry.getKey()));
        }

    }
}
