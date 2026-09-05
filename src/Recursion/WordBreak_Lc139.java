package Recursion;

import java.util.List;

public class WordBreak_Lc139 {
    static Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[301];

        return checkWord(0, s, wordDict);

    }
    public boolean checkWord(int idx, String s, List<String> wordDict){
        if(idx==s.length()) return dp[idx]=true;
        if(dp[idx]!=null)return dp[idx];
        for(int length=idx+1; length<=s.length(); length++){
            String temp=s.substring(idx,length);
            if(isFind(temp,wordDict)&&checkWord(length,s,wordDict)){
                return dp[idx]=true;
            }
        }
        return dp[idx]=false;
    }
    public boolean isFind(String temp, List<String>wordDict){
        for(int i=0; i<wordDict.size(); i++){
            String curr=wordDict.get(i);
            if(curr.equals(temp)){
                return true;
            }
        }
        return false;
    }
}
