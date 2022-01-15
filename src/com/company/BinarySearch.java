package com.company;
import java.util.Arrays;


import static java.util.Arrays.sort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list={2,4,6,9,11,12,14,20,26,35,49};
        int X = 20;

        int ind = binarySearch(list,X);
        System.out.println(ind);
    }
    //return index
    //return -1 if it does not exist.
    private static int binarySearch(int[] list, int N) {

        int start = 0;
        int end = list.length-1;

        while(start<=end)
        {
            //find the middle element
            int middle = start + (end - start)/2;

            if(list[middle]==N)
            {
                return middle;
            }
            else if (list[middle] > N)
                    {
                        end = middle - 1;
                    }
            else
                    {
                        start = middle + 1;
                    }

        }
        return -1;
    }


}
