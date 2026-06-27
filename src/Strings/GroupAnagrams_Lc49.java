package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_Lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
            /// Time complexity--> O(NK) N length of strs and K Maximum length of a string in strs
            HashMap<String, List<String>> map=new HashMap<>();
            for(String s:strs){
                /// Step1: Count freq of char in s string
                int []freq=new int[26];
                for(char c:s.toCharArray()){
                    freq[c-'a']++;
                }
                /// Step2: Creating unique hash key using # and i
                StringBuilder sb=new StringBuilder();
                for(int i:freq){
                    sb.append("#");
                    sb.append(i);
                }
                String key=sb.toString();

                /// Step3: check key in map
                if(!map.containsKey(key)){
                    //if not contains then put key and create empty list
                    map.put(key,new ArrayList<>());
                }
                //then put s in list associate to that key;
                map.get(key).add(s);

            }
            return new ArrayList<>(map.values());
    }

}
