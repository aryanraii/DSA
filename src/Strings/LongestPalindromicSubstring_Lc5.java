package Strings;

public class LongestPalindromicSubstring_Lc5 {
    //Time Complexity-->O(n^2) and space complexity-->O(n^2);
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=0;
        int start=0;
        Boolean[][] dp = new Boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(i,j,s,dp)){
                    if(max<j-i+1){
                        max=j-i+1;
                        start=i;
                    }
                }

            }
        }
        return s.substring(start,start+max);
    }

    private boolean isPalindrome(int i,int j,String s,Boolean[][] dp) {

        if(i>=j)return true;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=isPalindrome(i+1,j-1,s+s.charAt(j),dp);
        }else{
            return dp[i][j]=false;
        }
    }
}
