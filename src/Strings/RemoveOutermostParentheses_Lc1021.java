package Strings;

import java.util.Stack;

public class RemoveOutermostParentheses_Lc1021 {
    public String removeOuterParentheses(String s) {
         int len = s.length();
         StringBuilder sb=new StringBuilder();
         int counter=0;
         for(int i=0;i<len;i++){
             if(s.charAt(i)==')')counter--;
             if(counter!=0)sb.append(s.charAt(i));
             if(s.charAt(i)=='(')counter++;
         }
         return sb.toString();
    }
}
