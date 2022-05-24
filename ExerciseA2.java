package com.company;
/*
Slide 15
Write a program in Java to calculate the power of any number using recursion

 */

public class ExerciseA2 {
    public static int calculatePower(int baseNum, int power) {
        if (power == 0) {
            return 1;

        } else if (power > 0) {
            return baseNum * calculatePower(baseNum, power - 1);

        } else {
            return 1 / calculatePower(baseNum, power);
        }
    }

    public static void main(String[] args) {
        int answer = calculatePower(2, 3);
        System.out.println(answer);
    }

}
