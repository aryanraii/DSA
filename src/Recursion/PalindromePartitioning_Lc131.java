package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_Lc131 {
    //Time complexity-->O(n*2^n)
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        checkPallindrome(s,res,list,0);
        return res;
    }

    private void checkPallindrome(String s, List<List<String>> res, List<String> list, int idx) {
        if(idx==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPallindrome(s,idx,i)){
                list.add(s.substring(idx,i+1));
                checkPallindrome(s,res,list,i+1);//explore
                list.remove(list.size()-1);//backtrack
            }
        }
    }

    private boolean isPallindrome(String s, int idx, int i) {
         while(idx<i){
             if(s.charAt(idx)!=s.charAt(i)){
                 return false;
             }
             idx++;
             i--;
         }
        return  true;
    }
}
