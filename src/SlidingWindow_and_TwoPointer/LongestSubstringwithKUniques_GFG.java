package SlidingWindow_and_TwoPointer;

import java.util.HashMap;

public class LongestSubstringwithKUniques_GFG {
    public int longestKSubstr(String s, int k) {
        int n=s.length();
        int maxLength=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                int freq=map.get(s.charAt(i))-1;
                if(freq==0){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i),freq);
                }
                i++;
            }
            if(map.size()==k){
                maxLength=Math.max(maxLength,j-i+1);
            }
            j++;
        }
        return (maxLength==Integer.MIN_VALUE)?-1:maxLength;
    }
}
