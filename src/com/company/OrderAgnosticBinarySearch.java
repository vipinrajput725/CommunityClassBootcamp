package com.company;
//Hello there Agnostic Binary search is here...........
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] elementList= {20,18,15,14,12,10,6,3,2};
        int target = 14;
        int ans = orderAgnosticBS(elementList,target);
        System.out.println(ans);

    }
    static int  orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        //find whether the array is in ascending or descending.
        boolean isASC = arr[start]<arr[end];
        //below logic is for sorting it will increase the time complexity in case of descending order of list and alter
        // Alter the indexes of the elements.
//        if(!isASC){
//            int i =0;
//            while(i<arr.length/2){
//                int tmp = arr[i];
//                arr[i]= arr[arr.length-1-i];
//                arr[arr.length-1-i++]=tmp;
//
//            }
//        }

        while(start<=end) {
           //find the middle element
            int middle = start + (end - start)/2;

            if(arr[middle]==target) {
                //and found
                return middle;
            }
            if (isASC) {
                if (arr[middle] > target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            else {
                if (arr[middle] < target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
