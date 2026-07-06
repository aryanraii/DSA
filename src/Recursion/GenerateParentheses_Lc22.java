package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_Lc22 {
    //Time complexity-->O(2^n) and space complexity-->O(2n)
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int open=0;
        int close=0;
        checkParatheses(open,close,n,list,sb);
        return list;
    }

    private void checkParatheses(int open,int close ,int n, ArrayList<String> list,StringBuilder sb) {
        if(sb.length()==2*n){
            list.add(sb.toString());
            return;
        }
        //remove unnecessary calls by applying these two conditions
        //condition1-->
         if(open<n){
             sb.append("(");
             checkParatheses(open+1,close,n,list,sb);
             sb.deleteCharAt(sb.length()-1);
         }
         //condition2-->
         if(close<open){
             sb.append(")");
             checkParatheses(open,close+1,n,list,sb);
             sb.deleteCharAt(sb.length()-1);
         }
    }


    //Time complexity-->((2^n)*2n) ans space complexity-->O(2n)
//    public List<String> generateParenthesis(int n) {
//        ArrayList<String> list=new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        checkParatheses(n,list,sb);
//        return list;
//    }
//
//    private void checkParatheses( int n, ArrayList<String> list,StringBuilder sb) {
//        if(sb.length()==2*n){
//            if(isValid(sb)) {
//                list.add(sb.toString());
//            }
//
//            return;
//        }
//        sb.append("(");
//        checkParatheses(n,list,sb);
//        sb.deleteCharAt(sb.length()-1);
//
//        sb.append(")");
//        checkParatheses(n,list,sb);
//        sb.deleteCharAt(sb.length()-1);
//    }
//
//    private boolean isValid(StringBuilder sb) {
//        int n=sb.length();
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(sb.charAt(i)=='('){
//                count++;
//            }else{
//                count--;
//            }
//            if(count<0){
//                return false;
//            }
//        }
//        return (count==0)?true:false;
//    }
}
