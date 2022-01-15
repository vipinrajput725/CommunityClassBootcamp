package com.company;

public class LeetcodeCelingChar {
    public static void main(String[] args) {
        char[] letters= {'c','f','j'};
        char target = 'c';

        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end =letters.length-1;
        int mid = 0;
        boolean isAsc= letters[start]<letters[end];
        if (isAsc){
            if (letters[letters.length-1]<target)
            {
                return 'z';
            }
        }
        else{
            if(letters[0]<target)
                return 'z';
        }

        while(start<=end){
            mid = start + (end-start)/2;

            // if(letters[mid]==target){
            //     return mid;
            // }
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
        return letters[start% letters.length];
    }
}
