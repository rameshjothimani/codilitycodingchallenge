package com.codility.codingchallenge;

import java.util.Arrays;

//Number of distinct values in array
public class DistinctArrayValues {

    public static void main(String args[]) {
        int[] input = {2, 1, 1, 2, 3, 1};
        DistinctArrayValues distinctArrayValues = new DistinctArrayValues();
        distinctArrayValues.findDistinct(input);

    }

    public void findDistinct(int[] input) {
        Arrays.sort(input);
        int length = input.length;
        int distinctCount = 0;

        for (int i = 0; i < length; i++) {
            while (i < length - 1 && input[i] == input[i + 1]) {
                i++;
            }

            distinctCount++;

        }

        System.out.println(distinctCount);

    }
}
