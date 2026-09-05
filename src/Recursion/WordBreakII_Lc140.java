package Recursion;

import java.util.ArrayList;
import java.util.List;

public class WordBreakII_Lc140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans=new ArrayList<>();
        String str="";
        generate(0,s,str,wordDict,ans);
        return ans;
    }
    public void generate(int idx,String s, String curr,List<String>wordDict, List<String>ans){
        if(idx==s.length()){
            ans.add(curr);
            return;
        }
        for(int len=idx+1; len<=s.length(); len++){
            String temp=s.substring(idx,len);
            if(isValid(temp,wordDict)){
                String tempStr=curr;
                if(!curr.isEmpty()){
                    curr+=" ";
                }
                curr+=temp;
                generate(len,s,curr,wordDict,ans);
                curr=tempStr;
            }
        }
    }
    public boolean isValid(String temp,List<String>wordDict){
        for(int i=0; i<wordDict.size(); i++){
            if(temp.equals(wordDict.get(i))){
                return true;
            }
        }
        return false;
    }
}
