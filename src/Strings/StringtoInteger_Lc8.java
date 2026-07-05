package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringtoInteger_Lc8 {
    //Time complexity-->O(n);
    public int myAtoi(String s) {
        //Step1-->Ignore any leading whitespace
        s=s.trim();
        int n=s.length();
        if(n==0) return 0;
        long num=0;
        //Step2-->assigning sign
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        //Step3-->conversion
        while(i<n && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0'); // conversion from ASCII to int
            if(num*sign >Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(num*sign <Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}
