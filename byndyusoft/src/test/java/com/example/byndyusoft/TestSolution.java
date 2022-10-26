package com.example.byndyusoft;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {
    @Test
    public void testSumOfTwoMinElementsIfArrayIsEmpty(){
        int[] array = new int[0];
        assertEquals(0,Solution.sumOfTwoMinElements (array));
    }
    @Test
    public void testSumOfTwoMinElements(){
        int[] array = new int[]{5,11,31,0,-5};
        assertEquals(-5,Solution.sumOfTwoMinElements (array));
    }
    @Test
    public void testSumOfTwoMinElementsIfArrayHaveOneHundredMillionElements(){
        int[] array = new int[100000000];
        array[0]=1;
        array[1]=2;
        Arrays.fill (array,2,100000000,3);
        assertEquals(3,Solution.sumOfTwoMinElements (array));
    }
}