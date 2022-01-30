package com.company;

public class CeilngNumberBs {
    public static void main(String[] args) {
        int list[]={1,2,4,6,7,9};
        int target =6;

        int ans = findCeilling(list,target);
        System.out.println(ans);
    }

    static int findCeilling(int[] letters, int target){
        int start = 0;
        int end =letters.length-1;
        int mid = 0;
        boolean isAsc= letters[start]<letters[end];
        if (isAsc){
            if (letters[letters.length-1]<target)
            {
                return -1;
            }
        }
        else{
            if(letters[0]<target)
                return -1;
        }

        while(start<=end){
            mid = start + (end-start)/2;

            if(letters[mid]==target){
                return mid;
            }
            if(isAsc){
                if(letters[mid]<target){
                    start= mid +1;
                }
                else {
                    end = mid -1;
                }
            }
            else{
                if(letters[mid]>target){
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
