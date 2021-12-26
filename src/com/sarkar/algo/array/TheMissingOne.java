package com.sarkar.algo.array;

import java.util.Arrays;
import java.util.List;

public class TheMissingOne {

    public static int findMissing(List<Integer> input){
        int sumOfElements = 0;
        for(Integer x : input){
            sumOfElements += x;
        }

        int n = input.size() + 1;
        int actualSum = (n * (n + 1)) / 2;

        System.out.println("n - " + n);
        System.out.println("sumOfElements - " + sumOfElements);
        System.out.println("actualSum - " + actualSum);


        return actualSum - sumOfElements;
    }

    public static void main(String[] args) {
        System.out.println(
                findMissing(Arrays.asList(3, 7, 1, 2, 8, 4, 5))
        );
        
            
        }
}
