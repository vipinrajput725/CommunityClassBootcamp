package com.company;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {

                {1, 2, 4, 5},
                {12, 23, 454, 465,},
                {22, 43, 45, 65, 76},
                {34, 23}
        };

        int target = 34;
        int[] ans = Search(arr,target);
        int max = SearchMax(arr);
        System.out.println("number "+target+" found at index:" + Arrays.toString(ans) + "\nmax number in the arrya is:" + max);
    }

    static int[] Search(int[][] arr,int target){
        for(int row = 0; row<arr.length;row++){

            for(int col=0;col<arr[row].length;col++){

                if (target==arr[row][col]){
                     return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int SearchMax(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row<arr.length;row++){

            for(int col=0;col<arr[row].length;col++){

                if (arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
