package com.example.byndyusoft;

import java.util.Arrays;

import static java.lang.System.out;

public class Solution {
    /**
     * метод для нахождения суммы двух минимальных элементов массива
     * @return сумма в формате int.В некорректных ситуациях возвращает 0.
     */
    public static int sumOfTwoMinElements(int[] array){
        return Arrays.stream(array)
                .sorted ()
                .limit (2)
                .sum ();
    }
}
