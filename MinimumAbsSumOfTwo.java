package com.codility.codingchallenge;

import java.util.Arrays;

//Find minimum absolute sum of two
class MinimumAbsSumOfTwo {
    public int solution(int[] A) {
        Arrays.sort(A);
        int first = 0;
        int last = A.length - 1;
        int minAbsSum = Math.abs(A[first] + A[last]);

        while (first <= last) {
            int currentSum = A[first] + A[last];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
            if (currentSum <= 0)
                first++;
            else
                last--;
        }
        return minAbsSum;
    }

    public static void main(String args[]){
        int[] A={7, 8, 9, 5, 6, 4, 2, -3};
        MinimumAbsSumOfTwo minimumAbsSumOfTwo=new MinimumAbsSumOfTwo();
        System.out.println(minimumAbsSumOfTwo.solution(A));
    }


}
