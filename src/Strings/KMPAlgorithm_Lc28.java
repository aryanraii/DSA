package Strings;

public class KMPAlgorithm_Lc28 {

    /// Time complexity-->O(n+m)
    public int strStr(String text, String pat) {
        /// KMP

        char pattern[]=pat.toCharArray();
        /// Step1: Build LPS(Longest prefix suffix)
        int[]lps=buildLPS(pattern);

        /// Step2: comapre
        int i=0;//text traverse
        int j=0;//pat traverse
        int n=text.length();
        int m=pat.length();
        while(i<n){
            if(pat.charAt(j)==text.charAt(i)){
                i++;
                j++;
                if(j==m){//whole pattern is matched;
                    return i-m;
                }
            }else{
                if(j==0)i++;
                else j=lps[j-1];
            }
        }
        return -1;
    }

    private int[] buildLPS(char[] pattern) {
        int len=0;
        int i=1;
        int m=pattern.length;
        int[] lps = new int[m];
        while(i<m){
            if(pattern[i]==pattern[len]){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0)i++;
                else{
                    len=lps[len-1];
                }
            }
        }
        return lps;
    }
}
