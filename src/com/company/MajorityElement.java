package com.company;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a ={3,1,3,3,2};
        int index=0;
        int maincount=0;
        for(int i =0;i<a.length;i++){
            int tmpcount=0;
            for (int j=i;j<a.length;j++)
            {
                if (a[i]==a[j]){
                    tmpcount++;
                }
            }
            if (tmpcount>maincount){
                maincount=tmpcount;
                index = i;
            }
        }
        if(maincount>a.length/2){
            System.out.println(a[index]);
        }
        else
            System.out.println(-1);
        System.out.println(Arrays.toString(a));
    }
}
