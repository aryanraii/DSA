package Strings;

import java.util.Arrays;

public class PermutationinString_Lc567 {
     /// USE SLINDING WINDOW BASED APPROACH
    /// Time Complexity in worst case-->O(n^2) which is valid because size of s1*s2 < 10^4;
    public boolean checkInclusion(String s1, String s2) {

        /// Step1: count freq of s1
        int freq[]=new int [26];
        Arrays.fill(freq,0);
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
        }
        int windSize=s1.length();
        /// Step2: check freq in S2 within window size of s1
        for(int i=0; i<s2.length(); i++) {
            int windIdx=0, idx=i;
            int windFreq[]=new int[26];

            while(windIdx<windSize && idx<s2.length()) {
                windFreq[s2.charAt(idx)-'a']++;
                windIdx++;
                idx++;
            }

            ///  check freq between both arrays
            if(isFreqSame(freq,windFreq)){
                return true;
            }
        }
        return false;
    }

    private boolean isFreqSame(int[] freq, int[] windFreq) {
        for(int i=0; i<26; i++) {
            if(freq[i]!=windFreq[i]) return false;
        }
        return true;
    }

}
