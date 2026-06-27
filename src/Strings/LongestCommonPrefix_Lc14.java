package Strings;

public class LongestCommonPrefix_Lc14 {
    /// Time complexity-->O(N*M) && Space complexity-->O(n) because of SB
    public String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];
       for(int i=1; i<strs.length;i++){
           prefix=commonPrefix(prefix,strs[i]);
       }
       return prefix;
    }
    public String commonPrefix(String s1, String s2) {
        int n=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n; i++){//run m times where m length of shortest prefix
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
