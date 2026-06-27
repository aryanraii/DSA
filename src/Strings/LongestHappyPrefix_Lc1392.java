package Strings;

public class LongestHappyPrefix_Lc1392 {
    public String longestPrefix(String s) {
        /// Step 1: BUild LPS
        //LPS: longest proper prefix which is also suffix
        char[] arr = s.toCharArray();
        int[] lps = buildLPS(arr);
        int n=lps.length;
        String str="";
        str=s.substring(0,lps[n-1]);
        return str;
    }

    private int[] buildLPS(char[] arr) {
        int len=0;
        int i=1;
        int n=arr.length;
        int[]lps=new int[n];
        while(i<n){
            if(arr[i]==arr[len]){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0) i++;
                else{
                    len=lps[len-1];
                }
            }
        }
        return lps;
    }
}
