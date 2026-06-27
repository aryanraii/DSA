package Strings;

public class RabinKarpAlgorithm_Lc28 {
    /// Time complexity-->O(N+M);
    public int strStr(String text, String pat) {
        /// Rabin Karp Algorithm
        int n=text.length();
        int m=pat.length();
        if(m>n)return -1;
        int base=256;
        int mod=101;
        int hash=1;
        for(int j=0; j<m-1; j++){
            hash=(hash*base)%mod;
        }

        /// Initial window hash
        int windowHash=0;
        int patHash=0;
        for(int i=0; i<m; i++){
            windowHash=(base*windowHash + text.charAt(i))%mod;
            patHash=(base*patHash + pat.charAt(i))%mod;
        }
        if(windowHash==patHash){
            int j=0;
            while(j<m){
                if(text.charAt(j)!=pat.charAt(j)){
                    break;
                }
                j++;
            }
            if(j==m){
                return 0; // 0 is  initial window index
            }
        }

        /// solve for next window
        for(int i=1; i<=n-m; i++){
            /// rolling hash
            windowHash=(windowHash-text.charAt(i-1)*hash)%mod;
            windowHash=(windowHash*256+text.charAt(i+m-1))%mod;
            if(windowHash<0){
                windowHash+=mod;
            }
            /// compare
            if(windowHash==patHash){
                int j=0;
                while(j<m){
                    if(text.charAt(j)!=pat.charAt(j)){
                        break;
                    }
                    j++;
                }
                if(j==m){
                    return i;
                }
            }
        }
        return -1;
    }
}
