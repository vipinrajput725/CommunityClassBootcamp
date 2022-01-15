package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 6, 3, 14, 16, 19, 23};
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-->0) {
            System.out.print("=");
            int N = in.nextInt();
            boolean ans = linearSearch3(N, list);
            System.out.println(ans);
        }
    }

    static int linearSearch(int N, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (N == list[i]) {
                return i;
            }
        }
        return -1;
    }
    static int linearSearch2(int N, int[] list) {
        for (int element:list ){
            if (element==N) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int N, int[] list) {
        for (int element:list){
            if (element==N)
            {
                return true;
            }
        }
        return false;
    }
}
