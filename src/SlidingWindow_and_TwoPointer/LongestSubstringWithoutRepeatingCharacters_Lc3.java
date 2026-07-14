package SlidingWindow_and_TwoPointer;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters_Lc3 {
    //Time complexity-->O(n) space complexity-->O(k==256)
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int left=0;
        int right=0;
        int maxLength=0;
        int freq[]=new int[256];
        Arrays.fill(freq,-1);
        while(right<len){
            if(freq[s.charAt(right)]!=-1){
                if(freq[s.charAt(right)]>=left) left=freq[s.charAt(right)]+1;
            }
            int length=right-left+1;
            maxLength=Math.max(length,maxLength);
            freq[s.charAt(right)]=right;
            right++;
        }
        return maxLength;
    }
    //Time complexity-->O(n^2) space complexity-->O(256==k);
//    public int lengthOfLongestSubstring(String s) {
//        int len=s.length();
//        if(len==0) return 0;
//        int maxLength=Integer.MIN_VALUE;
//        for(int i=0;i<len;i++){
//            int freq[]=new int[256];
//            for(int j=i;j<len;j++){
//                if(freq[s.charAt(j)]==1){
//                    break;
//                }
//                maxLength=Math.max(j-i+1,maxLength);
//                freq[s.charAt(j)]=1;
//            }
//        }
//        return maxLength;
//    }
}
