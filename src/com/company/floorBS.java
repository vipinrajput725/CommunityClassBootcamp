package com.company;

public class floorBS {
    public static void main(String[] args) {
        int list[]={1,2,4,6,7,9};
        int target =5;

        int ans = floor(list,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        int mid = 0;
        boolean isAsc= arr[start]<arr[end];
        if (isAsc){
            if (arr[0]>target)
            {
                return -1;
            }
        }
        else{
            if(arr[arr.length-1]>target)
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
        return end;
    }
}
