package com.company;

import java.util.Arrays;

public class reverseStringword {

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        char arr[] = S.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(arr[i] =='.'){
                arr[i]=',';
            }
        }
        S =new String(arr);
        System.out.println("here"+ S);
        String ans = revString(S);
        System.out.println(ans);

    }

    static String revString(String S) {

        System.out.println(S);
        String[] strarr = S.split(",");
        System.out.println(Arrays.toString(strarr));
        S = "";
        for (int i = strarr.length - 1; i >= 0; i--) {
            if (i == strarr.length - 1) {
                S = S + strarr[i];
            } else {
                S = S + "." + strarr[i];
            }
        }
            return S;
//        System.out.println(Arrays.toString(strarr));
//        return "No ans";

    }
}
