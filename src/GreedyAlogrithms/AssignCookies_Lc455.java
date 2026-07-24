package GreedyAlogrithms;

import java.util.Arrays;

public class AssignCookies_Lc455 {
    //Time complexity-->O(nlogn+mlom+m) space complexity-->O(1)
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);//Tc O(mlogm)
        Arrays.sort(g);//Tc O(nlogn)
        int i=0;
        int j=0;
        while(i<g.length&&j<s.length){//Tc O(m)
            if(g[i]<=s[j]){
                i=i+1;
            }
            j=j+1;
        }
        return i;
    }
}
