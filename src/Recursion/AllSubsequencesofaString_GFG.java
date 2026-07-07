package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequencesofaString_GFG {
    //Time complexity-->O(n*2^n) space complexity-->O(n)
    public List<String> powerSet(String s) {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generateSequences(0,ans,sb,s);
        Collections.sort(ans);
        return ans;
    }

    private void generateSequences(int i,List<String> ans, StringBuilder sb, String s) {
        if(i>=s.length()){
            ans.add(sb.toString());
            return;
        }
        //take-->
        sb.append(s.charAt(i));
        //explore-->
        generateSequences(i+1,ans,sb,s);
        //undo-->
        sb.deleteCharAt(sb.length()-1);
        //not take;
        generateSequences(i+1,ans,sb,s);

    }
}
