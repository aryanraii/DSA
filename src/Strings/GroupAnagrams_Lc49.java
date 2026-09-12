package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_Lc49 {
    ///sorting method using hashMap-->
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0; i<n; i++){
            String str=strs[i];
            char[]ch=str.toCharArray();
            Arrays.sort(ch);
            String sortString=ch.toString();
            if(!map.containsKey(sortString)){
                List<String>ls=new ArrayList<>();
                ls.add(str);
                map.put(sortString,ls);
            }else{
                List<String>ls1=map.get(sortString);
                ls1.add(str);
                map.put(sortString, ls1);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
//    public List<List<String>> groupAnagrams(String[] strs) {
//            /// Time complexity--> O(NK) N length of strs and K Maximum length of a string in strs
//            HashMap<String, List<String>> map=new HashMap<>();
//            for(String s:strs){
//                /// Step1: Count freq of char in s string
//                int []freq=new int[26];
//                for(char c:s.toCharArray()){
//                    freq[c-'a']++;
//                }
//                /// Step2: Creating unique hash key using # and i
//                StringBuilder sb=new StringBuilder();
//                for(int i:freq){
//                    sb.append("#");
//                    sb.append(i);
//                }
//                String key=sb.toString();
//
//                /// Step3: check key in map
//                if(!map.containsKey(key)){
//                    //if not contains then put key and create empty list
//                    map.put(key,new ArrayList<>());
//                }
//                //then put s in list associate to that key;
//                map.get(key).add(s);
//
//            }
//            return new ArrayList<>(map.values());
//    }



    // public List<List<String>> groupAnagrams(String[] strs) {
    //     int n=strs.length;
    //     List<List<String>> ans=new ArrayList<>();
    //     List<String>list=new ArrayList<>();
    //     list.add(strs[0]);
    //     ans.add(list);
    //     for(int i=1; i<n; i++){
    //         boolean flag=false;
    //         for(int j=0; j<ans.size(); j++){
    //             List<String>ls=ans.get(j);
    //             if(checkAnagram(strs[i],ls.get(0))){
    //                 ls.add(strs[i]);
    //                 flag=true;
    //                 break;
    //             }
    //             // else{
    //             //      List<String>list1=new ArrayList<>();
    //             //      list1.add(strs[i]);
    //             //      ans.add(list1);
    //             // }
    //         }
    //         if(flag==false){
    //             List<String>list1=new ArrayList<>();
    //             list1.add(strs[i]);
    //             ans.add(list1);
    //         }
    //     }
    //     return ans;
    // }
    // public boolean checkAnagram(String s1, String s2){
    //     int m=s1.length();
    //     int n=s2.length();
    //     if(m!=n)return false;
    //     int[]freq=new int[26];
    //     for(int i=0; i<m; i++){
    //         freq[s1.charAt(i)-'a']++;
    //         freq[s2.charAt(i)-'a']--;
    //     }
    //     for(int j=0; j<26; j++){
    //         if(freq[j]!=0)return false;
    //     }
    //     return true;
    // }

}
