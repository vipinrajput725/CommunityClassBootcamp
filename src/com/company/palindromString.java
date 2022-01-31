package com.company;

import java.util.Arrays;

public class palindromString {
    public static void main(String[] args) {
        String arr[] = {"rtxyfrucal",
                "shdsx",
                "mbekte",
                "ymq",
                "i",
                "takobmfsg",
                "ds",
                "mscltezlzd",
                "arzyiuhx",
                "nceucw",
                "rysck",
                "woctmevk",
                "gni",
                "tskf",
                "byei",
                "ju",
                "j",
                "tokhxwktxq",
                "l",
                "juwllyzgy",
                "lfv",
                "hskaynlpg",
                "zpc",
                "az",
                "ozh",
                "zyoxfp",
                "qv",
                "y",
                "erqdyfau",
                "qm",
                "xkuwrtehj",
                "wcwpqp",
                "qfxht",
                "ubwo",
                "woiggv",
                "v"};

//                {"geekf", "geeks", "or","keeg", "abc",
//                "bc"};

        int ans = isPalindrome(arr.length,arr);
        System.out.println(ans);
    }

    static int isPalindrome(int N,String[] arr){
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                String str = arr[i] + arr[j];
//                System.out.println(str);
                char[] newstr =str.toCharArray();
                boolean matched = false;
                for(int p =0;p<newstr.length-p;p++){
                    if (newstr[p]!=newstr[newstr.length-1-p]){
                        matched = false;
                        break;
                    }
                    matched = true;
                }
                if(matched) {
                    System.out.println(Arrays.toString(newstr));
                    count++;
                }

            }
        }
        return count;
    }
}
