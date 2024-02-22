package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");
                list.addAll(Arrays.asList(split));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String word1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                String word2 = list.get(j);
                if (Pair.isMirrorWordPair(word1, word2)) {
                    Pair pair = new Pair();
                    pair.setFirst(word1);
                    pair.setSecond(word2);
                    result.add(pair);
                    break;
                }
            }
        }
        System.out.println(result);
    }


    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public static boolean isMirrorWordPair(String word1, String word2) {
            return new StringBuilder(word1).reverse().toString().equals(word2);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
