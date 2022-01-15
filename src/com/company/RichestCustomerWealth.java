package com.company;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{2,3,8},{4,1,0}};
        int ans = RichestCustomer(accounts);
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Richest person has wealth="+ans);
    }

    private static int RichestCustomer(int[][] accounts) {
        int max = 0;
        for(int[] ch:accounts ){
            int x = 0;
            for(int bal:ch){
                x += bal;
            }
            if(x>max){
                max= x;
            }
        }
        return max;
    }
}
