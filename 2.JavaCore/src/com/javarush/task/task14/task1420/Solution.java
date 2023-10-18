package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int firstNumber = Integer.parseInt(reader.readLine());
//        int secondNumber = Integer.parseInt(reader.readLine());
//        for (int i = Math.min(firstNumber, secondNumber); i > 0; i--) {
//            if (firstNumber % i == 0 && secondNumber % i == 0){
//                System.out.println(i);
//                break;
//            }
//
//        }
        BigInteger bigInteger = new BigInteger(reader.readLine());
        BigInteger bigInteger1 = new BigInteger(reader.readLine());
        System.out.println(bigInteger.gcd(bigInteger1));

    }
}
