package com.company;

public class CeilngNumberBs {
    public static void main(String[] args) {
        int list[]={1,2,4,6,7,9};
        int target =6;

        int ans = findCeilling(list,target);
        System.out.println(ans);
    }

    static int findCeilling(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        int mid = 0;
        boolean isAsc= arr[start]<arr[end];
        if (isAsc){
            if (arr[arr.length-1]<target)
            {
                return -1;
            }
        }
        else{
            if(arr[0]<target)
                return -1;
        }

        while(start<=end){
            mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start= mid +1;
                }
                else {
                    end = mid -1;
                }
            }
            else{
                if(arr[mid]>target){
                    start= mid +1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return start;
    }
}
