package com.codility.codingchallenge;



class Solution {
    public int solution(Tree T) {
        return isVisible(T, Integer.MIN_VALUE);
    }


    private int isVisible(Tree root, int maxVal) {

        if(root == null) {
            return 0;
        }

        int count = 0;

        if(root.x >= maxVal) {
            count = 1;
            maxVal = root.x;
        }

        return count + isVisible(root.l, maxVal) + isVisible(root.r, maxVal);
    }

}




public class Tree {
    public int x;
    public Tree l;
    public Tree r;


    public static void main(String args[]){

        Solution solution=new Solution();
        solution.solution(l);
    }

}
