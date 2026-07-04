package Strings;

import java.util.Stack;

public class ValidParentheses_Lc20 {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if(c==')'){
                if(stack.size()>0&&stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(c==']'){
                if(stack.size()>0&&stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(c=='}'){
                if(stack.size()>0&&stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
