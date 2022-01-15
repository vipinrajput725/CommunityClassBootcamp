package com.company;

public class SearchInStrings {

    public static void main(String[] args) {

       String  name= "Vipin";
        char chr = 'i';
        System.out.println(search2(name,chr));
    }

    static boolean search(String str,char chr){

        if (str.length()==0)
        {
         return false;
        }

        for (int i=0;i<str.length();i++){
            if(chr==str.charAt(i)) {
                return true;
            }
        }
        return false;

    }

    static String search2(String str,char chr){

        if (str.length()==0)
        {
            return "null string";
        }

        for (char ch:str.toCharArray()){
            if(ch== chr) {
                return "found";
            }
        }
        return "not found";

    }

    public static class FindMinNumber {
        public static void main(String[] args) {
            int[] arr = {1,2,-3,4,56,45,34,-32};

            System.out.println(FindMin(arr));
        }
        // assume that arr.length!=0
        //return the minmum number from the array
        static int FindMin(int[] arr){
            int ans = arr[0];
            for(int element :arr){
                if (element<ans){
                    ans = element;
                }


            }
            return ans;
        }
    }
}
