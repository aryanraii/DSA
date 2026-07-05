package Strings;

public class PalindromicSubstrings_Lc647 {
    //Approach3-->mid point
    public int countSubstrings(String s){
         int n = s.length();
         int count=0;
         for(int i=0;i<n;i++){
             count+=check(s,i,i);//odd length
             count+=check(s,i,i+1);//even length

         }
         return count;
    }

    private int check(String s, int i, int j) {
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }

    //Approach2-->tabulation
//        public int countSubstrings(String s){
//        int n = s.length();
//        int count = 0;
//        Boolean dp[][]=new Boolean[n][n];
//        for(int length=1; length<=n; length++){
//            for(int i=0; i+length-1<n; i++){
//                int j=i+length-1;
//                if(i==j){//one length
//                    dp[i][j]=true;
//                }else if(i+1==j){//two length
//                    if(s.charAt(i)==s.charAt(j)){
//                        dp[i][j]=true;
//                    }else{
//                        dp[i][j]=false;
//                    }
//                }else{//generic solution
//                    dp[i][j]=(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]);
//                }
//
//                if(dp[i][j]==true){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


    //Approach1-->normal dp
//    public int countSubstrings(String s) {
//        int n=s.length();
//        int count=0;
//        Boolean[][] dp = new Boolean[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(isPalindrome(i,j,s,dp)){
//                    count++;
//                }
//
//            }
//        }
//        return count;
//    }
//    private boolean isPalindrome(int i,int j,String s,Boolean[][] dp) {
//
//        if(i>=j)return true;
//        if(dp[i][j]!=null){
//            return dp[i][j];
//        }
//        if(s.charAt(i)==s.charAt(j)){
//            return dp[i][j]=isPalindrome(i+1,j-1,s+s.charAt(j),dp);
//        }else{
//            return dp[i][j]=false;
//        }
//    }
}
