package com.company.sorting;

import java.util.Arrays;

public class bubleSort {
    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,8,-2,9,-1};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){

        for (int i =0;i<arr.length;i++){
            boolean jSwap = false;
            for(int j=0;j<arr.length-i-1;j++){
                //if Jth element is greater than the next element than swap
                if(arr[j]>arr[j+1])
                {
                    //swap
                    jSwap = true;
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            //if now swap happend for a particular element in the array means arrya is sorted.
            //no need to continue further. you can exit the loop.
            if (!jSwap){
                break;
            }

        }
    }
}
