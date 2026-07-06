package Strings;

import java.util.Arrays;

public class SumofBeautyofAllSubstrings_Lc1781 {
    //Time complexity-->O(n^2)
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int []freq=new int[26];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int beauty=getMaxcount(freq)-getMincount(freq);
                ans+=beauty;
            }
        }
        return ans;
    }

    private int getMincount(int[] freq) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                min=Math.min(min,freq[i]);
            }
        }
        return min;
    }

    private int getMaxcount(int[] freq) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            max=Math.max(max,freq[i]);
        }
        return max;
    }


    //Time complexity-->O(n^3)
//    public int beautySum(String s) {
//        int n=s.length();
//        int ans=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                ans+=checkFreq(i,j,s);
//            }
//        }
//        return ans;
//    }
//
//    private int checkFreq(int i, int j,String s) {
//        int freq[]=new int[26];
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for(int index=i; index<=j; index++){
//            freq[s.charAt(index)-'a']++;
//        }
//        for(int f:freq){
//            if(f>0){
//                min=Math.min(min,f);
//                max=Math.max(max,f);
//            }
//        }
//        return max-min;
//    }
}
