package GreedyAlogrithms;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisString_Lc678 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean ans=checkValidString(s);
        System.out.println(ans);
    }
    //Tc-->O(n) Sc-->O(1) Range concept used
    public static boolean checkValidString(String s) {
         int n=s.length();
         int minRange=0;
         int maxRange=0;
         for(int i=0;i<n;i++){
             if(s.charAt(i)=='('){
                 minRange=minRange+1;
                 maxRange=maxRange+1;
             }
             else if(s.charAt(i)==')'){
                 minRange=minRange-1;
                 maxRange=maxRange-1;
             }else{
                 minRange=minRange-1;
                 maxRange=maxRange+1;
             }
             if(minRange<0) minRange=0;
             if(maxRange<0) return false;
         }
         return (minRange==0);
    }
    //Time complexity-->O(3^n) and space complexity-->O(n) recursive solution
//    public static boolean checkValidString(String s) {
//        int n=s.length();
//        boolean ans=check(s,0,0);
//        return ans;
//    }
//    private static boolean check(String s, int idx, int count) {
//        if(count<0)return false;
//        if(idx==s.length()){
//            return (count==0);
//        }
//        if(s.charAt(idx)=='('){
//            return check(s,idx+1,count+1);
//        }
//        if(s.charAt(idx)==')'){
//            return check(s,idx+1,count-1);
//        }
//        return check(s,idx+1,count+1)||check(s,idx+1,count-1)||check(s,idx+1,count);
//    }
}
