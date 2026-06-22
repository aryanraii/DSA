package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram_Lc242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int [26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0) return false;
        }
        return true;
    }
}
