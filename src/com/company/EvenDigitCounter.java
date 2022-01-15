package com.company;

public class EvenDigitCounter {
    public static void main(String[] args) {
        int[] arr={23,433,12443,-1212,43,-4545};

        int ans = findNumber2(arr);
        System.out.println(ans);


    }

    static int findNumber2(int[] nums){
        int count = 0;
        for(int element:nums){
            if(element<0){
                element = element * -1;
            }

            int digit = (int)(Math.log10(element))+1;
            if (digit%2==0){
                count++;
            }

        }
        return count;
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int n: nums){
            if(even(n)){
                count++;
            }
        }

        return count;
    }
// function to check wheather a number contains even digit or not?
    private static boolean even(int n) {
       int counter=0;
       if (n<0){
           n = n* -1;
       }
       if(n==0){
           return false;
       }
        while (n>0){
            counter++;
            n = n/10;
        }
        if (counter%2==0)
        {
        return true;
        }
        else
        {
            return false;
        }
    }
}
