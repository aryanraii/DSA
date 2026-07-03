package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStrings_Lc205 {

    //Time complexity-->O(n)
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int StoT[]=new int[128];
        int TtoS[]=new int[128];
        Arrays.fill(StoT,-1);
        Arrays.fill(TtoS,-1);
        StringBuilder S=new StringBuilder(s);
        StringBuilder T=new StringBuilder(t);
        for(int i=0; i<n; i++){
            char char1=S.charAt(i);
            char char2=T.charAt(i);
            if(StoT[char1]==-1){
                StoT[char1]=char2;
            }
            if(TtoS[char2]==-1){
                TtoS[char2]=char1;
            }

            if(StoT[char1]!=char2 || TtoS[char2]!=char1){
                return false;
            }
        }
        return true;
    }

//    public boolean isIsomorphic(String s, String t) {
//        int n=s.length();
//        HashMap<Character,Character> map1=new HashMap<>();// s-->t
//        HashMap<Character,Character> map2=new HashMap<>();//t-->s
//        for(int i=0;i<n;i++){
//            char s1=s.charAt(i);
//            char t1=t.charAt(i);
//            if(!map1.containsKey(s1)){
//                map1.put(s1,t1);
//            }
//            if(!map2.containsKey(t1)){
//                map2.put(t1,s1);
//            }
//
//            if(map1.get(s1)!=t1 || map2.get(t1)!=s1){
//                return false;
//            }
//
//        }
//        return true;
//    }
}
