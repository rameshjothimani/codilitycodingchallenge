package com.codility.codingchallenge;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String args[]) {
        int[] input = {3, 8, 9, 7, 6};
        int rotationTime = 3;
        CyclicRotation cyclicRotation=new CyclicRotation();

        for (int i=0;i<rotationTime;i++){
            cyclicRotation.rotateArray(input,rotationTime);
        }
        System.out.println("Result::" + Arrays.toString(cyclicRotation.rotateArray(input,rotationTime)));
    }

    private int[] rotateArray(int[] input,int rotationTIme){

        int temp = input[input.length-1];
        /*int[] tempArray= new int[rotationTIme];
        for(int i=0;i<rotationTIme;i++){
            tempArray[i] = input[i];
        }*/

        for(int i=input.length-1;i>0;i--){
            input[i] = input[i-1];

        }
        input[0] = temp;

        return input;

    }

}
