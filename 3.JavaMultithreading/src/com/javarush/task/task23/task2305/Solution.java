package com.javarush.task.task23.task2305;

/* 
Inner
*/

import java.util.Arrays;

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    @Override
    public String toString() {
        return "Solution{" +
                "innerClasses=" + Arrays.toString(innerClasses) +
                '}';
    }

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        solution1.innerClasses[0] = new Solution().new InnerClass();
        solution1.innerClasses[1] = new Solution().new InnerClass();

        solution2.innerClasses[0] = new Solution().new InnerClass();
        solution2.innerClasses[1] = new Solution().new InnerClass();

        Solution[] solutions = new Solution[2];
        solutions[0] = solution1;
        solutions[1] = solution2;

        return solutions;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTwoSolutions()));
    }
}
