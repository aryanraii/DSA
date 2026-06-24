package Strings;

public class MinimumRecolors {
/// Slinding window : Time Complexity-->O(n);
    public int minimumRecolors(String blocks, int k) {
         int n=blocks.length();
         int white=0;
         for(int i=0; i<k; i++){
             if(blocks.charAt(i)=='W')white++;
         }
         int ans=white;
         for(int i=1; i<n-k+1; i++){
             if(blocks.charAt(i-1)=='W') white--;
             if(blocks.charAt(i+k-1)=='W') white++;
             ans=Math.min(ans,white);
         }
         return ans;
    }

///  Normal Method: TIme complexity-->O(nk);
//    public int minimumRecolors(String blocks, int k) {
//        int n=blocks.length();
//        int ans=Integer.MAX_VALUE;
//        for(int i=0; i<n-k+1; i++){
//            int chng=0;
//            for(int j=i; j<k+i; j++){
//                if(blocks.charAt(j)=='W'){
//                    chng++;
//                }
//            }
//            ans=Math.min(ans,chng);
//        }
//        return ans;
//    }

}
